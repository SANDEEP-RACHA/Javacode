package fb;

public class MethodOverload {
	public void abc()
	{
		System.out.println("sandeep");
	}
	public void abc(int i,int j)
	{
		System.out.println(i+j);
	}
	public void abc(int i,int j,double k)
	{
		System.out.println(i+j+k);
	}
	public static void main(String args[])
	{
		MethodOverload obj=new MethodOverload();
		obj.abc();
		obj.abc(5,5);
		obj.abc(25,69,67);
	}
}
