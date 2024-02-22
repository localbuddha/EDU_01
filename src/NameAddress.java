import java.util.Scanner;

public class NameAddress {


    public static void main(String[] args) {
        String name;
        String address;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = scanner.nextLine();
        System.out.print("Where do you live, " + name + "?: ");
        address = scanner.nextLine();
        System.out.println("Hey, " + name + "! I know where you live! It's " + address);
        scanner.close();

    }
}
