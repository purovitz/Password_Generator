package generator;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Generator {

    private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";
    private static SecureRandom random = new SecureRandom();
    private int passwordLengths;


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

    public static String makePassword(int len, String dic) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            result += dic.charAt(index);
        }
        return result;
    }
    public void generatePassword(){
        boolean includeSymbols = includeSymbols();
        boolean includeNumbers = includeNumbers();
        boolean includeLowercase = includeLowercaseCharacters();
        boolean includeUppercase = includeUppercaseCharacters();

        if (includeSymbols && includeNumbers && includeLowercase && includeUppercase) {
            System.out.println("Your generated password is:");
            String password = makePassword(passwordLengths, ALPHA_CAPS + ALPHA + SPECIAL_CHARS + NUMERIC);
            System.out.println(password);
            System.out.println();
        }
        }
    }







