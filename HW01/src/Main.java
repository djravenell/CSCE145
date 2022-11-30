import java.util.Arrays;
import java.util.Scanner;
//DJ Ravenell
public class Main {

    private static void print(String s) {
        System.out.println(s);
    }

    public static double min(double[] ns) {
        Arrays.sort(ns);
        return ns[0];
    }

    public static double max(double[] ns) {
        Arrays.sort(ns);
        int max = ns.length - 1;
        return ns[max];
    }

    public static double mean(double[] ns) {
        double mean = 0;

        for (int i = 0; i < ns.length; ++i) {
            mean += ns[i];
        }

        mean /= ns.length;
        return mean;
    }

    public static double median(double[] ns) {
        Arrays.sort(ns);
        int type = ns.length % 2;
        double median = 0;
        int length = ns.length / 2;
        double a = ns[(int) Math.ceil(length)];
        double b = ns[(int) Math.floor(length)];
        if (type == 0) {
            median = (a + b) / 2;
        } else if (type == 1) {
            median = ns[(int) Math.floor(length)];
        }
        return median;
    }

    public static double mode(double[] ns) {
        Arrays.sort(ns);

        double mode = 0;
        double mostPop = 0;

        for (int i = 0; i < ns.length; ++i) {
            double value = ns[i];
            double recurrence = 1;

            for (int x = 0; x < ns.length; ++x) {
               if (value == ns[x]) {
                   ++recurrence;
               }
               if (recurrence > mostPop) {
                   mode = value;
                   mostPop = recurrence;
               }
            }
        }

        return mode;
    }

    public static void main(double[] args) {
        Scanner in = new Scanner(System.in);
        double nums[] = new double[100];

        print("Please enter a list of numbers"
        +"\none per line. Enter a blank line to end input."
        +"\n(max 100 numbers)");

        boolean cont = true;
        int i = 0;
        while (cont) {
            String input = in.nextLine();
           if (input.equals("")) {
               cont = false;
           } else {
               nums[i] = Double.parseDouble(input);
               ++i;
           }
        }

        double nums1[] = new double[i];
        for (int x = 0; x < nums1.length; ++x) {
            nums1[x] = nums[x];
        }

        print("Would you like to do"
                +"\n1. mean,"
                +"\n2. median,"
                +"\n3. mode,"
                +"\n4. max,"
                +"\n5. min, or"
                +"\n6. all?"
        +"\n (please pick a number)");

        int pick = Integer.parseInt(in.nextLine());
        switch (pick) {
            case 1:
                print("The mean is "+ mean(nums1));
                break;
            case 2:
                print("The median is "+ median(nums1));
                break;
            case 3:
                print("The mode is "+ mode(nums1));
                break;
            case 4:
                print("The max is "+ max(nums1));
                break;
            case 5:
                print("The min is "+ min(nums1));
                break;
            case 6:
                print("The mean is "+ mean(nums1));
                print("The median is "+ median(nums1));
                print("The mode is "+ mode(nums1));
                print("The max is "+ max(nums1));
                print("The min is "+ min(nums1));
                break;
        }
    }
}