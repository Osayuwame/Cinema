import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFalse = false;

        int size = scanner.nextInt();

        int[] elem = new int[size];

        for (int i = 0; i < elem.length; i++) {
            elem[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();

        for (int j: elem) {
            if (num == j) {
                isFalse = true;
                break;
            }
        }
        System.out.println(isFalse);
    }
}