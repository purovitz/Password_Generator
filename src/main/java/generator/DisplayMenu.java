package generator;

public class DisplayMenu {
    public static void display() {
        System.out.println("====================PASSWORD GENERATOR====================");
        System.out.println("1 - Password Length(max. 64): ");
        System.out.println("2 - Include symbols(e.g. @#$%) ||| Y/N");
        System.out.println("3 - Include Numbers(e.g. 123456) ||| Y/N");
        System.out.println("4 - Include Lowercase Characters(e.g. abcdefgh) ||| Y/N");
        System.out.println("5 - Include Uppercase Characters(e.g. ABCDEFGH) ||| Y/N");
        System.out.println("=========================================================");
    }

    public static void displayRun() {
        System.out.println("====================PASSWORD GENERATOR====================");
        System.out.println("Do you want to generate a password?(Y/N)");
        System.out.println("=========================================================");
    }



}
