import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || (i == n / 2) || (j == 0 || j == n - 1) && i != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i >= n / 2 && (i == j || n - 1 == i + j)) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || (i == n / 2) || (j == 0 || j == n - 1) && i != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || ((i == 0 || i == n - 1) && (j != 0 && j != n - 1))
                        || j == n - 1 && (i != 0 && i != n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j==0 ||i+j==n/2 || i-j==n/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}
