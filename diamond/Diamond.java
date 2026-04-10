import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Number must be positive.");
            return;
        }

        if (n % 2 == 1) {
            printOddDiamond(n);
        } else {
            printEvenDiamond(n);
        }
    }

    // Odd diamond code
    public static void printOddDiamond(int n) {
        int mid = n / 2;

        // Top half
        for (int i = 0; i <= mid; i++) {
            printSpaces(mid - i);
            printStars(2 * i + 1);
            System.out.println();
        }

        // Bottom half
        for (int i = mid - 1; i >= 0; i--) {
            printSpaces(mid - i);
            printStars(2 * i + 1);
            System.out.println();
        }
    }

    // Even diamond code
    public static void printEvenDiamond(int n) {
        int mid = n / 2;

        // Top half
        for (int i = 1; i <= mid; i++) {
            printSpaces(mid - i + 1);
            printStarPairs(i);
            System.out.println();
        }

        // Bottom half
        for (int i = mid - 1; i >= 1; i--) {
            printSpaces(mid - i + 1);
            printStarPairs(i);
            System.out.println();
        }
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

    public static void printStarPairs(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }
}
