public class Character3 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j<=5-i+1; j++)
            {
                System.out.print((char)(ch+j-1));
            }
            // ch++;
            System.out.println();
        }

    }
}
