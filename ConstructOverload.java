package fb;

public class ConstructOverload {
	public void Abc()
	{
		System.out.println("sandeep");
	}
	public void Abc(int i,int j)
	{
		System.out.println(i+j);
	}
	public void Abc(int i,int j,double k)
	{
		System.out.println(i+j+k);
	}
	public static void main(String args[])
	{
		ConstructOverload obj=new ConstructOverload();
		obj.Abc();
		obj.Abc(5,8);
		obj.Abc(5,8,97);
	
	}
}
