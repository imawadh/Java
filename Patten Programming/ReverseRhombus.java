import java.util.Scanner;

public class ReverseRhombus {
    public static void main(String[] args) {
        System.out.print("Enter the side of Rhombus :: ");
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        for(int i =1;i<=side;i++)
        {
            for(int j =1; j<=side-i; j++)
            {
                System.err.print(" ");
            }
            for(int j =0; j<side; j++)
            {
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
