import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowNum = 0;
        int counter = 0;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    counter++;
                }
                if (matrix[i][j] == 1) {
                    counter = 0;
                }
                if (counter == k) {
                    rowNum = i + 1;
                    System.out.println(rowNum);
                    return;
                }
            }
            counter = 0;
        }
        System.out.println(rowNum);



    }
}