import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;


        int size = scanner.nextInt();

        int[] elem = new int[size];


        for (int i = 0; i < elem.length; i++) {
            elem[i] = scanner.nextInt();
        }


        int n = scanner.nextInt();
        for (int j : elem) {
            if (j > n) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}