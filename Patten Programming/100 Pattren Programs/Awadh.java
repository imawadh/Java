import java.util.Scanner;

public class Awadh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            //A
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
            //W
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
            //A
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
            //D
            for (int j = 0; j < n; j++) {
                if (j == 0 || ((i == 0 || i == n - 1) && (j != 0 && j != n - 1))
                        || j == n - 1 && (i != 0 && i != n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //H
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
            //K
            for (int j = 0; j < n; j++) {
                if (j==0 ||i+j==n/2 || i-j==n/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //I
            for(int j =0; j<n; j++)
            {
                if(i==0 || j==n/2 || i==n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            
            //S
            for(int j =0; j<n; j++)
            {
                if((i==0 || i==n/2 || i==n-1)&&(j!=0 || j!=n-1) || (i>0 && i<n/2 && j==0)|| i>n/2 && i<n && j==n-1 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            //H
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
            //O
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if((i==0 || i==n-1) && (j!=0 && j!=n-1) || (j==0 || j==n-1) && (i!=0 && i!=n-1) )
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //R -- solve it 
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if(j==0 && i!=0|| (j<n/2 && j!=0 &&i==0) || (j==n/2 && i<n/2 && i!=0) || (i==n/2 && j<n/2)|| i-j==n/2)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            //S
            for(int j =0; j<n; j++)
            {
                if((i==0 || i==n/2 || i==n-1)&&(j!=0 || j!=n-1) || (i>0 && i<n/2 && j==0)|| i>n/2 && i<n && j==n-1 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            //I
            for(int j =0; j<n; j++)
            {
                if(i==0 || j==n/2 || i==n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            //N
            for(int j =0; j<n; j++)
            {
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            //G
















// solve it ....













            for(int j =0; j<n;j++)
            {
                if(j==0 && i!=0 && i!=n-1)
            }
            
            //H
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

            System.out.println();

        }
    }
}
