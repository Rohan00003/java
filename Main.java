import java.util.Scanner;
class Main
{
	public static void main(String[]arg)

	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=obj.nextLine();
		System.out.println("Enter Age: ");
		int age=obj.nextInt();
		System.out.println("Enter Salary: ");
		float salary=obj.nextFloat();
		System.out.println("Enter Grade: ");
		char Grade=obj.next().charAt(0);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Grade: "+Grade);
	}
}