import java.util.Scanner;

class Rectangle{
    public static void main(String [] args)
    {
        System.out.print("Enter the Len of Rectangle :: ");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        System.out.print("Enter the Wid of Rectangle :: ");
        int wid = scan.nextInt();
        for(int i=0; i<len; i++)
        {
            for(int j =0; j<wid; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}