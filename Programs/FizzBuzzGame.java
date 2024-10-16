import java.util.Scanner;

class FizzBuzzGame{
    public static void main(String [] args)
    {
        // float  f = 6.0f;
        System.out.print("Enter a nuber :: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(num%3==0){
            System.out.println("Fizz");
        }
        else if(num%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }
    }
}