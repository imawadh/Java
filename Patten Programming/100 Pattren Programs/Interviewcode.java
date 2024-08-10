import java.util.Scanner;

public class Interviewcode {
    
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER OF ROWS :: ");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int oddnumber  = 3;
        System.out.print(1);
        for(int i =1; i<=row; i++)
        {
            int oddcount = 0;
            int sum = 0;
            for(int j =1; j<i; j++)
            {
                System.out.print(oddnumber+" ");
                sum += oddnumber;
                oddnumber+=2;
                oddcount++;
            }
            if(i!=1)
            {
            System.out.print((sum)+(oddnumber-2)*oddcount+(oddcount*(oddcount+1))+" ");
            }
            for(int j =1; j<i; j++)
            {
                System.out.print(oddnumber+" ");
                oddnumber+=2;
            }
            System.out.println();
        }
    }
}
