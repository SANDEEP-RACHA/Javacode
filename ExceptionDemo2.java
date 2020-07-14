package fb;

public class ExceptionDemo2 {

	public static void main(String args[])
	{
		try
		{
			int a[]=new int[6];
			a[6]=8;
			int i=7,j=4;
			int c=i/j;
			System.out.println("output is  "+ c);
			}
		catch(ArithmeticException 
				e)
		{
			System.out.println("error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("hello");
		}
			
		finally
		{
			System.out.println("bye");
		}
	}
}
