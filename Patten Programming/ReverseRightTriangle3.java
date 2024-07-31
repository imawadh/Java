import java.util.Scanner;

class ReverseRightTriangle3 {
    public static void main(String[] args) {
        System.out.print("Enter the height of Triangle  :: ");
        Scanner var1 = new Scanner(System.in);
        int var2 = var1.nextInt();
        for (int i =1 ;i<=var2; ++i)
        {
            for(int j=1;j<=var2-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    