//Name: Bob Password: Coffee
import java.util.Scanner;

public class Main {

    private static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean login = false;

        while (!login) {

            print("What is your name?");
            String name = in.nextLine();
            print("What is your password?");

            String pass = in.nextLine();
            if (name.equals("Bob") && pass.equals("Coffee")) {
                print("You're in");
                login = true;
            } else {
                print("Somethings not right");
            }

        }

        //Asks to proceed to calculator or stop if wanted
        print("(C)ontinue to calculator or (S)top?");
        String choice = in.nextLine();
        if (choice.toLowerCase().trim().equals('s')) {
            System.exit(0);
        }

        while (choice.toLowerCase().trim().equals("c")) {

            print("C2F Converter \nEnter the temperature, numbers only:");
            double temp = in.nextDouble();
            in.nextLine();
            print("Enter the unit, C or F:");
            String scale = in.nextLine();
            if (scale.toLowerCase().trim().equals("c")) {
                temp = (9.0 / 5.0) * temp + 32.0;
                print(temp + "F");
            } else if (scale.toLowerCase().trim().equals("f")) {
                temp = (5.0 / 9.0) * (temp - 32.0);
                print(temp + "C");
            }

            print("(C)ontinue or (S)top?");
            choice = in.nextLine();

        }
    }
}