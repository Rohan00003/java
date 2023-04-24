import java.util.Scanner;
class SumEven
{
	public static void main(String args[])
	{
		int Number, i, evenSum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int sum=sc.nextInt();
		for(i=1;i<=Number;i++)
		{
			if(i%2==0)
			{
				evenSum=evenSum+i;
			}
		}
		System.out.println("\n The Sum of Even Numbers upto " + Number + "  =  " + evenSum);
	}
}		