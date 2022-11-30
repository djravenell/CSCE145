import java.util.Scanner;
public class Main {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] temps = new double[10];

        print("Welcome to the above average temperature tester program.");
        for (int i = 0; i < 10; ++i) {
            print("Please enter the temperature for day " + (i+1));
            temps[i] = Double.parseDouble(in.nextLine());
        }

        double average = 0;
        for (int i = 0; i < temps.length; ++i) {
            average += temps[i];
        }

        average /= temps.length;
        int above = 0;

        for (int i = 0; i < temps.length; ++i) {
            if (temps[i] > average) {
                ++above;
            }
        }

        int[] day = new int[above];
        double[] aboveTemp = new double[above];

        int j = 0;
        for (int i = 0; i < temps.length; ++i) {
            if (temps[i] > average) {
                    day[j] = i + 1;
                    aboveTemp[j] = temps[i];
                    ++j;
            }
        }

        print("The average temperature was " + average);
        print("The days that were above average were");
        for (int i = 0; i < above; ++i) {
            print("Day " + day[i] + " with " + aboveTemp[i]);
        }
        print("\nDone!");
    }
}