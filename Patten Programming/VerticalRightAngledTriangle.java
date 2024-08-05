import java.util.Scanner;

public class VerticalRightAngledTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the odd height of triangle :: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i<=(a+1)/2 ; i++)
        {
            for(int k=1; k<= (a+1)/2 -i+1; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i<=(a+1)/2 ; i++)
        {
            for(int k = 1; k<=i; k++)
            {
                System.out.print(" ");
            }
            for(int j =1; j<= (a+1)/2-i+1;j++)
            {
                System.out.print("*");   
            }
            System.out.println();
        }

    }
}
