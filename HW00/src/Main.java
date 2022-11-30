//Devar Ravenell
import java.util.Scanner;

public class Main {

    private static void print(String s) {
        System.out.println(s);
    }

    private static int number(String s) {
        int num = 0;

        if (s.equals("zero")) {
            num = 0;
        } else if (s.equals("one")) {
            num = 1;
        } else if (s.equals("two")) {
            num = 2;
        } else if (s.equals("three")) {
            num = 3;
        } else if (s.equals("four")) {
            num = 4;
        } else if (s.equals("five")) {
            num = 5;
        } else if (s.equals("six")) {
            num = 6;
        } else if (s.equals("seven")) {
            num = 7;
        } else if (s.equals("eight")) {
            num = 8;
        } else if (s.equals("nine")) {
            num = 9;
        }

        return num;
    }

    private static int compute (String s, Integer num1, Integer num2) {
        int ans = 0;

        if (s.equals("plus")) {
             ans = num1 + num2;
        } else if (s.equals("minus")) {
             ans = num1 - num2;
        } else if (s.equals("times")) {
             ans = num1 * num2;
        } else if (s.equals("over")) {
             ans = num1 / num2;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            print("Enter your problem, e.g. \"two plus two\", with spaces");

            String problem = in.nextLine();
            problem = problem.toLowerCase();

            String[] part = problem.split(" ");

            int num1 = number(part[0]);
            int num2 = number(part[2]);

            if (part[1].equals("over")) {
                int ans = compute(part[1], num1, num2);
                int remainder = num1 % num2;
                print(part[0] + " " + part[1] + " " + part[2] + " = " + ans
                        + "\nWith a remainder of " + remainder);
            } else {
                int ans = compute(part[1], num1, num2);
                print(part[0] + " " + part[1] + " " + part[2] + " = " + ans);
            }
            print("Would you like to do another?");
            String cont = in.nextLine();
            if (cont.toLowerCase().trim().equals("no")) {
                loop = false;
            }
        }

        print("Thank you for using our Calculator!");
    }
}