import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int num = a; num <= b; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0 ) {
                System.out.println("Fizz");
            } else if (num % 5 == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }

    }
}