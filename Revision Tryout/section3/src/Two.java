import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        try {
            if (num <= 0) {
                System.out.println("Please enter a positive number");
            } else {
                Diamond(num);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number");
        } finally {
            sc.close();
        }
    }

    static void Diamond(int n) {
        // Print upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
