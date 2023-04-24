import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		int fact=1;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of " + num + " is:" + fact);
	      
	}
}