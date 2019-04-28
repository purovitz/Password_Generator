import java.util.Scanner;

public class ApplicationRun {

    public static void run(){
        boolean isAplicationRun = true;
        Scanner scanner = new Scanner(System.in);
        while (isAplicationRun) {
            System.out.println("Do you want to generate a password?(Y/N)");
            System.out.print(":::");
            char answer = scanner.next().toLowerCase().charAt(0);
            if (answer == 'n') {
                isAplicationRun = false;
            } else {
                System.out.println("");
                System.out.println("Let's get started, shall we?");
                System.out.println("");
                DisplayMenu.display();
                break;
            }
        }
    }
}
