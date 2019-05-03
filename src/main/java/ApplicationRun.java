import java.util.Scanner;

public class ApplicationRun {

    public static void run() {
        boolean isAplicationRun = true;
        Scanner scanner = new Scanner(System.in);
        while (isAplicationRun) {
            DisplayMenu.displayRun();
            System.out.print(":::");
            char answer = scanner.next().toLowerCase().charAt(0);
            if (answer == 'y') {
                System.out.println("");
                System.out.println("Let's get started, shall we?");
                System.out.println("");
                DisplayMenu.display();
                Generator.passwordLength();
                Generator.generatePassword();
                break;
            } else {
                isAplicationRun = false;
            }
        }
    }
}
