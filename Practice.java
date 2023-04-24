import java.util.Scanner;
class Practice
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("1. To Withdraw the Money");
		System.out.println("2. To Deposite the Money");
		System.out.println("3. To Check the Balance");
		System.out.println("Enter your option: ");
		int option=sc.nextInt();
		int TAmount=20000;
		if(option==1)
		{
			System.out.println("Enter the Amount: ");
			int Amount=sc.nextInt();
			int a=TAmount-Amount;
			System.out.println(a);
			System.out.println("Your Amount is Succesfully Withdrawn");
		}
		if(option==2)
		{
			System.out.println("Enter the Amount: ");
			int Amount=sc.nextInt();
			System.out.println(TAmount+Amount);
			System.out.println("Your Amount is Succesfully deposited");
		}
		if(option==3)
		{
			System.out.println(TAmount);
			System.out.println("Thank You");
		}	
	}
}