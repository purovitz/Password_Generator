import java.util.InputMismatchException;
import java.util.Scanner;

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
                System.out.println(":::");
            }

        } catch (InputMismatchException e) {
            System.out.println("You gave the number in the wrong format.");
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
        Scanner scannerr = new Scanner(System.in);
        System.out.println("2 - Include symbols(Yes/No):");
        System.out.print(":::");
        String answer = scannerr.next().toLowerCase();
        if (answer.charAt(0) == 'y') {
            System.out.println("");
            System.out.println("You want your password to contain symbols.");
            return true;
        } else {
            System.out.println("");
            System.out.println("You don't want your password to contain symbols");
            return false;
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


