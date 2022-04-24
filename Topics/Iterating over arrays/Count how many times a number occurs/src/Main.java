import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int ele = scanner.nextInt();
        int occ = 0;


        for (int i = 0; i < n; i++) {
            if (ele == arr[i]) {
                occ++;
            }
        }
        System.out.println(occ);

    }
}