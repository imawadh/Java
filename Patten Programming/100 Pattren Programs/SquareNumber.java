public class SquareNumber {
    
    public static void main(String[] args) {
        for(int i =1; i<=10;i++)
        {
            for(int j =1; j<=10; j++)
            {
                if(j%2==1)
                {
                    System.out.print(i+10*(j-1)+" ");
                }
                else{
                    System.out.print((10*j)-(i-1)+ " ");
                }
            }
            System.out.println();
        }

    }
    
}
