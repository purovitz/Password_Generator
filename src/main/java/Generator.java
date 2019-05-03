import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Generator {

    public static final String lower = "abcdefghijklmnopqrstuvwxyz";
    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String numbers = "0123456789";
    public static final String symbols = "!@#$%&*()_+-=[]|,./?><";

    static int passwordLengths;

    public static Integer passwordLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Enter the password length:");
        System.out.print(":::");

        try {
            while ((passwordLengths = scanner.nextInt()) > 32) {
                System.out.println("Password can be up to 32 digits long, try again :).");
                System.out.print(":::");
            }

        } catch (InputMismatchException e) {
            System.out.println("You gave the number in the wrong format.");
            Generator.passwordTest();
        }
        return passwordLengths;
    }

    public static void passwordTest(){
        try {
            passwordLength();
        } catch (InputMismatchException e){
            passwordLength();
        }
    }



    public static boolean includeSymbols() {
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

    public static boolean includeNumbers() {
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

    public static boolean includeLowercaseCharacters() {
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

    public static boolean includeUppercaseCharacters() {
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




    public static void generatePassword() {
        Random random = new Random();
        Generator generator = new Generator();
        if (includeSymbols() && includeNumbers() && includeLowercaseCharacters() && includeUppercaseCharacters()) {
            List<String> passwordAll = new ArrayList<String>();
            List<String> passwordGenerated = new ArrayList<String>();
            passwordAll.add(numbers);
            passwordAll.add(symbols);
            passwordAll.add(upper);
            passwordAll.add(lower);

            for (int i = 0; i < passwordLengths; i++) {
                System.out.println(passwordAll.get(random.nextInt(passwordAll.size())));
            }




        }
    }


}


/*
public static Integer passwordLength() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = true;
        System.out.println("1 - Enter the password length:");
        System.out.print(":::");

        try {
            while ((passwordLength = scanner.nextInt()) > 32) {
                System.out.println("Password can be up to 32 digits long, try again :).");
                System.out.println(":::");
            }
        } catch (InputMismatchException e) {
            System.out.println("You gave the number in the wrong format.");
        }
        return passwordLength;
    }
 */


