import java.util.Scanner;

public class SpaceStarRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows :: ");
        int row = scan.nextInt();
        System.out.print("Enter no. of space in front of star :: ");
        int a = scan.nextInt();
        System.out.print("Enter no. of star :: ");
        int b = scan.nextInt();
        for(int i = 1;i<=row; i++)
        {
            for(int j =1; j<=a; j++)
            {
                System.out.print("_");
            }
            for(int j =1; j<=b; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
}
