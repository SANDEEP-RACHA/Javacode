package fb;
class Frnd{
	final int a=5;
	public void show()
	{
		final int	ABC=8;  // AS it is final we can use the variable with capital letter becausse the value is constant
		System.out.println(a);

	}
}
final class Frnd1{
	
	public void   A(int a) {
		
		System.out.println(a);
	}
	
}
//class Frnd2 extends Frnd1{
//	public void show()
//	{
//		System.out.println("sandeep");
//	}
//}
public class FinalDemo {
public static void main(String args[])
{
	Frnd1 obj =new Frnd1();
	obj.A(455);
}
}
