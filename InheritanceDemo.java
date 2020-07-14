package fb;
public class InheritanceDemo{
	public int add(int i, int j)
	{
		return i+j;
	}
}
class Calculator
{
	public int add(int i,int j)

	{
		return i+j;
	}
	public int mul(int i, int j)
	{
	return i*j;
	}

public static void main(String args[])
{

	Calculator obj2=new Calculator();
	int result1=obj2.add(25,14);
	int result2=obj2.mul(14,36);
	System.out.println(result1);
	System.out.println(result2);
}
}