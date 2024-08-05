import java.util.Scanner;

public class IsoscelesTriagle {
    public static void main(String[] args) {
        System.out.print("Enter the side of Isosceles Triangle :: ");
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        side = (side+1)/2;
        for(int i = 1; i<=side; i++)
        {
            for(int k = 1; k<side-i+1; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j= 1; j<i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
