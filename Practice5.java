import java.util.Scanner;
class Practice5
{
	public static void main(String args[]);
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the num: ");
	int num=sc.nextInt();
	int a= num/2;
	{
		if(a==1)
		{
			System.out.println("The number is even positive");
		}
		if(a==-1)
		{
			System.out.println("The number is even negative");
		}
		if(a>1)
		{
			System.out.println("The number is odd positive");
		}
		if(a<0)
		{
			System.out.println("The number is odd negative");
		}
	}
}