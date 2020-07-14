package fb;

 class InheritanceDamo2 {
	public int add(int i, int j)
	{
		return i+j;
	}

}
class Card extends InheritanceDamo2
{
	public int mul(int d, int e)
	{
		return d*e;
	}
}
 class Demo extends Card
 {
	 public int sub(int i, int j)
	 {
		 return i-j;
 }
 }
public class InheritanceDemo3{

public static void main(String args[])
{
		Demo obj2=new Demo();
		int d=obj2.add(45,28);
		float e= (float)obj2.mul(14,29);
		double f= (int)obj2.sub(26,64);
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
}

}
