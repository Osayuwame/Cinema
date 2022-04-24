import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        int size = scanner.nextInt();

        int[] elem = new int[size];

        for (int i = 0; i < elem.length; i++) {
            elem[i] = scanner.nextInt();
        }

        for (int j: elem) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}