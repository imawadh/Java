

public class hallow_diamond {
    public static void main(String[] args) {
        for(int i = 1; i<=8; i++)
        {
            for(int j = 1; j<=8-i+1; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=8-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
