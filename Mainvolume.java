import java.util.Scanner;
class volume
{
	int l;
	public int w;
	static int h=0;
}
class Mainvolume
{
	public static void main(String[] args)
	{
		volume v= new volume();
		volume v1= new volume();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimentions: ");
		int l=sc.nextInt();
		int w=sc.nextInt();

		System.out.println(v.l);
		System.out.println(v.w);
		System.out.println(v1.l);
		System.out.println(v1.w);
		System.out.println(volume.h);
	}
}