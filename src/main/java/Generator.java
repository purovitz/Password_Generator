import java.util.InputMismatchException;
import java.util.Scanner;

public class Generator {

    public static final String lower = "abcdefghijklmnopqrstuvwxyz";
    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String numbers = "0123456789";
    public static final String symbols = "!@#$%&*()_+-=[]|,./?><";

    public static Integer passwordLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password length:");
        System.out.print(":::");
        boolean isPasswordLengthCorrect = true;
        while (!isPasswordLengthCorrect) {
            try {
                Integer passwordAnswer = scanner.nextInt();
                if (passwordAnswer > 32) {
                    System.out.println("Password can be up to 32 digits long, try again :)");
                    System.out.println("");
                    System.out.println("Enter the password length:");
                    System.out.print(":::");
                    isPasswordLengthCorrect = false;
                } else {
                    isPasswordLengthCorrect = true;
                    return passwordAnswer;
                }
            } catch (InputMismatchException e) {
                System.out.println("You gave the number in the wrong format");
                isPasswordLengthCorrect = false;
            }
        }
        return null;
    }
}
