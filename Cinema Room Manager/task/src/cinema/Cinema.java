package cinema;
import java.util.Scanner;

public class Cinema {
    static int yourRow;
    static int yourSeat;
    static int rows;
    static int seats;
    static int counter = 0;
    static char count;
    static boolean flag;
    static int ticketPrice;
    static char[][] cinemaHall;
    static int currentIncome = 0;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seats = scanner.nextInt();


        cinemaHall = new char[rows+1][seats+1];


        boolean menu = true;

        while (menu) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int menuOption = scanner.nextInt();

            if (menuOption == 1) {
                showSeats(rows, seats, yourRow, yourSeat);
            } else if (menuOption == 2) {
                buyTicket(rows, seats);
            } else if (menuOption == 3) {
                statistics();
            } else if (menuOption == 0) {
                menu = false;
            }
        }
    }

    public static void showSeats(int rows, int seats, int yourRow, int yourSeat) {

        System.out.println("Cinema:");
        count = '1';

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++)
                if (cinemaHall[i][j] != 'B') {
                    cinemaHall[i][j] = 'S';
                }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= seats; j++) {
                cinemaHall[0][j] = count;
                count++;
            }
            count = '1';
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < 1; j++) {
                cinemaHall[i][j] = count;
                count++;

            }
        }

        char b = 'B';
        cinemaHall[yourRow][yourSeat] = b;
        cinemaHall[0][0] = ' ';
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                System.out.print(cinemaHall[i][j] + " ");
            } System.out.println();
        }

    }

    public static void buyTicket(int rows, int seats) {

        flag = true;
        while (flag) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a row number:");
            yourRow = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            yourSeat = scanner.nextInt();

            if (yourRow < 0 || yourRow > rows || yourSeat < 0 || yourSeat > seats) {
                System.out.println("Wrong input!");
                System.out.println();

            } else if (cinemaHall[yourRow][yourSeat] == 'B') {
                System.out.println("That ticket has already been purchased!");
                System.out.println();

            } else {
                flag = false;

                cinemaHall[yourRow][yourSeat] = 'B';

                int first = rows / 2;

                if (rows * seats < 60) {
                    ticketPrice = 10;
                } else if (yourRow <= first) {
                    ticketPrice = 10;
                } else {
                    ticketPrice = 8;
                }

                System.out.println("Ticket price: $" + ticketPrice);

                currentIncome += ticketPrice;

                counter++;
            }
        }
    }

    public static int purchasedTickets() {

        int countPurchasedTicket = 0;
        countPurchasedTicket += counter;

        return countPurchasedTicket;

    }

    public static double percentage() {

        double result;
        final double PERCENTAGE = 100;

        double ticketPurchased;
        int noOfSeats;

        ticketPurchased = purchasedTickets();
        noOfSeats = seats * rows;

        result = (ticketPurchased / noOfSeats) * PERCENTAGE;

        return result;

    }

    public static int totalIncome() {

        final int priceCheap = 8;
        final int priceNormal = 10;
        int totalSeats = rows * seats;
        int totalIncome;
        int half;

        if (totalSeats > 60) {
            if (rows % 2 == 0) {
                half = rows / 2;
                totalIncome = half * seats * priceCheap + half * seats * priceNormal;

            } else {

                half = rows / 2;
                totalIncome = (rows - half) * seats * priceCheap + half * seats * priceNormal;
            }

        } else {

            totalIncome = priceNormal * totalSeats;
        }
        return totalIncome;
    }

    private static void statistics() {

        String per = "%";

        System.out.printf("Number of purchased tickets: %d%n", purchasedTickets());

        System.out.printf("Percentage: %.2f%s%n", percentage(), per);

        System.out.printf("Current income: $%d%n", currentIncome);

        System.out.printf("Total income: $%d%n", totalIncome());


        System.out.println();
    }


}