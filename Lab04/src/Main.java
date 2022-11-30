import java.util.Scanner;
//Devar Ravenell

public class Main {

    private static void print(String s) {
        System.out.println(s);
    }

    private static boolean operate(boolean bool1, boolean bool2, String operator) {
        boolean ans = true;

        if (operator.equals("&&")) {
            ans = bool1&&bool2;
        } else if (operator.equals("||")) {
            ans = bool1||bool2;
        } else if (operator.equals("^")) {
            ans = bool1^bool2;
        } else if (operator.equals("!")) {
            ans = !bool1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cont = "";

        print("Welcome to the boolean logic quiz program"
        +"\nEnter answer or \"quit\" to quit");

        while (!cont.equals("quit")) {
            int op = (int) (Math.random() * 4 + 1);
            String operator = "";

            switch (op) {
                case 1:
                    operator = "&&";
                    break;
                case 2:
                    operator = "||";
                    break;
                case 3:
                    operator = "!";
                    break;
                case 4:
                    operator = "^";
                    break;
            }

            int bool1 = (int) (Math.random() * 2 + 1);
            int bool2 = (int) (Math.random() * 2 + 1);

            boolean case1 = ((bool1 == 1) ? true : false);
            boolean case2 = ((bool2 == 1) ? true : false);

            if (operator.equals("!")) {
                print(operator + case1 + " ==");
            } else {
                print("" + case1 + " " + operator + " " + case2 + " ==");
            }

            cont = in.nextLine();
            if (cont.equals("quit")) {

            } else {
                boolean ans = Boolean.parseBoolean(cont);
                if (ans == operate(case1, case2, operator)) {
                    print("Correct, Good job.");
                } else {
                    print("Drat, wrong answer.");
                }
            }
        }
    }
}