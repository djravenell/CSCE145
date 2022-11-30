import java.util.Scanner;

public class StringHelperDriver {


    /**
     * Welcomes user to the helper and ask which method they would like to use.
     * Based on selection asks for additional info and computes answer.
     * Continuously runs until user quits.
     * @param args
     */
    public static void main(String[] args) {
        StringHelper string = new StringHelper();
        Scanner in = new Scanner(System.in);
        boolean cont = true;
            System.out.println("Welcome to String helper!" +
                    "\nHow may I help you today?");
        while (cont) {
            System.out.println(
                    "\n[1] for replaceVowelsWith()" +
                    "\n[2] for weight()" +
                    "\n[3] for mashStrings()" +
                    "\n[4] to quit" +
                    "\nYour selection:");

            int selection = Integer.parseInt(in.nextLine());
            switch (selection) {
                case 1:
                    System.out.println("Base word:");
                    String baseWord = in.nextLine();
                    System.out.println("replace vowels with:");
                    String replacement = in.nextLine();
                    System.out.println("Result is: " + string.replaceVowelsWith(baseWord, replacement));
                    break;

                case 2:
                    System.out.println("Word:");
                    String word = in.nextLine();
                    System.out.println("Result is: " + string.weight(word));
                    break;

                case 3:
                    System.out.println("First word:");
                    String firstWord = in.nextLine();
                    System.out.println("Second word:");
                    String secondWord = in.nextLine();
                    System.out.println("Result is: " + string.mashStrings(firstWord, secondWord));
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

}
