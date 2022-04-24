import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        int i = 0;
        while (i < num) {
            int b = scanner.nextInt();
            if (b % 4 == 0 && b > count) {
                count = b;
            }
            i++;
        }
        System.out.println(count);






    }
}