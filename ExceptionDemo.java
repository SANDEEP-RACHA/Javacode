package fb;

public class ExceptionDemo {

	public static void main(String args[])
	{
		try
		{
			int i=7,j=4;
			int c=i/j;
			System.out.println("output is  "+ c);
			}
		catch(Exception e)
		{
			System.out.println("error");
		}
		finally
		{
			System.out.println("bye");
		}
	}
}
