
public class Character1 {
    public static void main(String[] args) {
        char a = 'E';
        for(int i =1; i<=5; i++)
        {
            for(int j = 1; j<=5-i+1; j++)
            {
                System.out.print((char)(a-j+1));
            }
            a--;
            System.out.println();
        }
    }
}
