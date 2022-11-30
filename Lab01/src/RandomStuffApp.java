//Devar Ravenell
import java.util.Scanner;

public class RandomStuffApp {

    private static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        print("Would you like to \n1. Play a game or \n2. Figure out what to eat");
        int option = Integer.parseInt(in.nextLine());

        if (option==1) {

            print("The game is rock, paper, scissors!"
            +"\nDo you pick (r)ock, (p)aper or (s)cissors?");

            String playHuman = in.nextLine();

            double random = Math.random();
            String computer = "";

            if (random >= 0.0 && random <= 0.3) {
                computer = "r";
            } else if (random > 0.3 && random <= 0.6) {
                computer = "p";
            } else {
                computer = "s";
            }

            if (playHuman.equals(computer)) {
                print("It's a tie!");
            } else if (playHuman.equals("r")) {
                if (computer.equals("s")) {
                    print("Rock beats scissors! You win!");
                } else {
                    print("Paper covers rock! You lose!");
                }
            } else if (playHuman.equals("p")) {
                if (computer.equals("r")) {
                    print("Paper covers rock! You win!");
                } else {
                    print("Scissors cut paper! You lose!");
                }
            } else if (playHuman.equals("s")) {
                if (computer.equals("p")) {
                    print("Scissors cuts paper! You win!");
                } else {
                    print("Rock beats scissors! You lose!");
                }
            }


        } else {

            print("Are you broke? (yes/no)");
            boolean broke = in.nextLine().toLowerCase().trim().equals("yes");

            if (broke) {
                print("Get up! Those vegetables aren't going to chop themselves");
            } else {
                print("Are you going to order a takeaway no matter what we tell you? (yes/no)");
                boolean takeout = in.nextLine().toLowerCase().trim().equals("yes");

                if (takeout) {
                    print("Fine, but at least get up and put some clothes on before the delivery guy arrives");
                    print(  "_______"+
                            "\n\\o o o/"+
                            "\n \\o o/"+
                            "\n  \\o/"+
                            "\n   v");
                } else {
                    print("Get up! Those vegetables aren't going to chop themselves");
                }
            }

        }

    }


}
