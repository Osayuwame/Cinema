import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {

        int currentMax = a;
        int highestIndex = 1;

        if (currentMax < b) {
            currentMax = b;
            highestIndex = 2;

        } else if (currentMax < c) {
            currentMax = c;
            highestIndex = 3;
        }

        return highestIndex;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}