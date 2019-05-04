import java.util.Scanner;

public class ApplicationRun {

    public static void run() {
        boolean isAplicationRun = true;
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator();
        while (isAplicationRun) {
            DisplayMenu.displayRun();
            System.out.print(":::");
            char answer = scanner.next().toLowerCase().charAt(0);
            if (answer == 'y') {
                System.out.println("");
                System.out.println("Let's get started, shall we?");
                System.out.println("");
                DisplayMenu.display();
                generator.passwordLength();
                generator.generatePassword();
                break;
            } else {
                isAplicationRun = false;
            }
        }
    }
}
