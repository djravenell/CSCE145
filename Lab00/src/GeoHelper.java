//Devar Ravenell
import java.util.Scanner;

public class GeoHelper {

    private static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        print("What is your name?");
        String name = in.nextLine();

        print("Hi " + name + "!");

        print("How big in diameter is your first pizza?");
        int diameter1 = in.nextInt();
        double area1 = (Math.PI * Math.pow(diameter1, 2))/4;
        print("The area of the first pizza is " + area1);

        print("How big in diameter is your second pizza?");
        int diameter2 = in.nextInt();
        double area2 = (Math.PI * Math.pow(diameter2, 2))/4;
        print("The area of the second pizza is " + area2);

        double compare = area2/area1;
        print("The area second pizza is " + compare + " times the area of the first");

        print("What are the width and height of a rectangular pizza please enter them seperated by a space:");
        int width = in.nextInt();
        int height = in.nextInt();
        print("The rectangular pizza has an area of "+ (width*height));

        print("Thank you for using my pizza app!");
    }
}
