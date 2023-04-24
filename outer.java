//create a class outrr with the data member int data=10 and the function int getdata() which returns the value of data varible.  

class outer 
{
	int data=10;
	int getdata()
	{
		return data;
	}
	public static void main(String []args)
	{
		outer obj=new outer();
		if(obj.data<20)
		{
			class inner
			{
				void print()
				{
					System.out.println("Local Inner class");
					System.out.println("Data: "+obj.getdata());
				}
			}
			inner obj1=new inner();
			obj1.print();
		}
	}
}