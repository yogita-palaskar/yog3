class Test
{
	public static void main(String args[])
	{
		int i=50,j=0;
		try
		{
			System.out.print(i/j);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant divided by zero");
		}
				
	}
}