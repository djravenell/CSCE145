import java.util.Scanner;
//Devar Ravenell
public class Main {

    private static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans = "";
        int num = 0;
        while(!ans.equals("quit")) {
            switch (num) {
                case 0:
                    print("(4) facts about if statements");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("ifs:"
                                +"\n> have 1 \"if\" part, 0-many \"else ifs\", and possibly an \"else\""
                                +"\n> ifs are branching statements"
                                +"\n> do their tests in a top to bottom order"
                                +"\n> only one test or else will \"pass\"");
                    }
                    break;
                case 1:
                    print("true && false ==");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("false");
                    }
                    break;
                case 2:
                    print("true || true ==");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                    print("true");
                }
                    break;
                case 3:
                    print("!true ==");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("false");
                    }
                    break;
                case 4:
                    print("true ^ true ==");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("false");
                    }
                    break;
                case 5:
                    print("true || false ==");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("true");
                    }
                    break;
                case 6:
                    print("false && false ==");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("false");
                    }
                    break;
                case 7:
                    print("(3) facts about byte types");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("bytes:"
                                +"\n> kind of value is integer"
                                +"\n> memory used is 1 byte"
                                +"\n> range of values -128 to 127");
                    }
                    break;
                case 8:
                    print("(2) facts about boolean types");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("booleans:"
                                +"\n> memory used is 1 bit"
                                +"\n> true or false");
                    }
                    break;
                case 9:
                    print("(2) facts about double types");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("doubles:"
                                +"\n> kind of value is floating-point"
                                +"\n> memory used is 8 bytes");
                    }
                    break;
                case 10:
                    print("(2) facts about float types");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("floats:"
                                + "\n> kind of value is floating-point"
                                + "\n> memory used is 4 bytes");
                    }
                    break;
                case 11:
                    print("(2) facts about char types");
                    ans = in.nextLine();
                    if (ans.equals("")) {
                        print("Display Answer "+ (num + 1));
                        print("chars:"
                                + "\n> kind of value is single character"
                                + "\n> memory used is 2 bytes");
                    }
                    break;
            }


            print("[Enter] to continue or \"quit\" to quit");
            ans = in.nextLine();
            ++num;
            num %= 12;
        }
    }
}