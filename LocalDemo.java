class Outer
{
	int x=10;
	Void display()
	{
		class Inner
		{
			int y;
			Inner()
			{
				y=20;
			}
			Void print;
			{
				System.out.println("Sum: " + x+y);
			}
		}
		Inner obj1=new Inner();
		obj1.print();
		}
	}
	class LocalDemo
	{
		public static void main(String []args)
		{
			Outer obj=new Outer();
			obj.display();
		}
	}
