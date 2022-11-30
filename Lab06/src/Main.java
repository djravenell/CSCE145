//DJ Ravenell
public class Main {

    public static int[] swap(int[] ns, int a, int b) {
        int first = ns[a];
        int second = ns[b];
        ns[a] = second;
        ns[b] = first;
        return ns;
    }

    public static void sort(int[] ns) {

        int i = 1;
        while (i < ns.length) {
            int j = i;
            while (j > 0 && ns[j-1] > ns[j]) {
                swap(ns, j, j-1);
                --j;
            }
            ++i;
        }

        System.out.print("{");

        for (int x = 0; x < ns.length; ++x) {
            if (x == ns.length - 1) {
                System.out.print(ns[x]);
            } else {
                System.out.print(ns[x] + ",");
            }
        }

        System.out.print("}");

    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.exit(0);
        } else if (args.length == 1) {
            System.out.print("{" + Integer.parseInt(args[0]) + "}");
        } else {
            int[] ns = new int[args.length];
            for (int i = 0; i < ns.length; ++i) {
                ns[i] = Integer.parseInt(args[i]);
            }
            sort(ns);
        }
    }

}
