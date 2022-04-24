import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        // 0  1  2   . 3  4  5 -- index
        // 1, 2, 3,  . 4, 5, 6

        int size = scanner.nextInt();

        int[] elem = new int[size];

        for (int i = 0; i < elem.length; i++) {
            elem[i] = scanner.nextInt();
        }

        for (int i = 0; i < elem.length; i++) {

            for (int j = i + 1; j < elem.length; j++) {

                for (int k = j + 1; k < elem.length; k++) {

                    if (elem[i] == elem[j] - 1 && elem[j] == elem[k] - 1) {
                        count++;

                    }
                }
            }

        }
        System.out.println(count);
    }
}