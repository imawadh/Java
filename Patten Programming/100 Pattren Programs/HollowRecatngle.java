import java.util.Scanner;

public class HollowRecatngle {
    
    public static void main(String[] args) {
        System.out.print("Enter the width of Rectangle :: ");
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        System.out.print("Enter the length of Rectangle :: ");
        int lenght = scan.nextInt();
        for(int i = 1; i<=width; i++)
        {
            for(int j =1; j<=lenght; j++)
            {
                if(i==width||i==1||j==lenght||j==1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
