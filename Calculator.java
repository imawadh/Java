import java.util.Scanner;
class Calculator{
	public static  int sum(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		int x,y,add;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		x = scan.nextInt();
		System.out.println("Enter the 2nd Number: ");
		y = scan.nextInt();
		add = sum(x,y);
		System.out.print("The sum of Numbers: ");
		System.out.println(add);

	}
		

}