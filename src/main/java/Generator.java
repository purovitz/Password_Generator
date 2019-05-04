import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Generator {

    public int passwordLengths;


    public Integer passwordLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Enter the password length:");
        System.out.print(":::");

        try {
            while ((passwordLengths = scanner.nextInt()) > 32 ) {
                System.out.println("Password can be up to 32 digits long, try again :).");
                System.out.print(":::");
            }

        } catch (InputMismatchException e) {
            System.out.println("You gave the number in the wrong format.");
            passwordTest();
        }
        return passwordLengths;
    }

    public void passwordTest(){
        try {
            passwordLength();
        } catch (InputMismatchException e){
            passwordLength();
        }
    }



    public boolean includeSymbols() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 - Include symbols?(Yes/No):");
        System.out.print(":::");
        String answer = scanner.next().toLowerCase();
        if (answer.charAt(0) == 'y') {
            System.out.println("");
            System.out.println("You want your password to contain symbols.");
            System.out.println("");
            return true;
        } else {
            System.out.println("");
            System.out.println("You don't want your password to contain symbols");
            System.out.println("");
            return false;
        }
    }

    public boolean includeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 - Include numbers?(Yes/No):");
        System.out.print(":::");
        String answer = scanner.next().toLowerCase();
        if (answer.charAt(0) == 'y') {
            System.out.println("");
            System.out.println("You want your password to contain numbers.");
            System.out.println("");
            return true;
        } else {
            System.out.println("");
            System.out.println("You don't want your password to contain numbers");
            System.out.println("");
            return false;
        }
    }

    public boolean includeLowercaseCharacters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("4 - Include lowercase characters?(Yes/No):");
        System.out.print(":::");
        String answer = scanner.next().toLowerCase();
        if (answer.charAt(0) == 'y') {
            System.out.println("");
            System.out.println("You want your password to contain lowercase characters.");
            System.out.println("");
            return true;
        } else {
            System.out.println("");
            System.out.println("You don't want your password to contain lowercase characters");
            System.out.println("");
            return false;
        }
    }

    public boolean includeUppercaseCharacters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 - Include lowercase characters?(Yes/No):");
        System.out.print(":::");
        String answer = scanner.next().toLowerCase();
        if (answer.charAt(0) == 'y') {
            System.out.println("");
            System.out.println("You want your password to contain uppercase characters.");
            System.out.println("");
            return true;
        } else {
            System.out.println("");
            System.out.println("You don't want your password to contain uppercase characters");
            System.out.println("");
            return false;
        }
    }





    public void generatePassword() {
        boolean includeSymbols = includeSymbols();
        boolean includeNumbers = includeNumbers();
        boolean includeLowerCase = includeLowercaseCharacters();
        boolean includeUpperCase = includeUppercaseCharacters();
        PasswordGenerator gen = new PasswordGenerator();

        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);


        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);


        CharacterData digitChars = EnglishCharacterData.Digit;
        CharacterRule digitRule = new CharacterRule(digitChars);


        CharacterData specialChars = new CharacterData() {
            public String getErrorCode() {
                return "Error";
            }

            public String getCharacters() {
                return "!@#$%^&*()_+";
            }
        };

        CharacterRule splCharRule = new CharacterRule(specialChars);

        if (includeSymbols && includeNumbers && includeLowerCase && includeUpperCase){
            String password = gen.generatePassword(passwordLengths, splCharRule, lowerCaseRule,
                    upperCaseRule, digitRule);
            System.out.println("Your password: " + password);
        }
    }
}






