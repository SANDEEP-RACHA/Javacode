package fb;

public class InheritanceDemo2 {
public int add(int a,int b)
{
	return a+b;
}

}
class Carry extends InheritanceDemo2
{
	public int mul(int d, int e)
	{
		return d*e;
	}


public static void main(String args[])
{
		Carry obj=new Carry();
		int d=obj.add(45,28);
		float e= (float)obj.mul(14,29);
		System.out.println(d);
		System.out.println(e);
}
}