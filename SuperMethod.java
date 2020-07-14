package fb;
class Abc
{
	public Abc()
	{
		System.out.println("sandeep");
	}
	public Abc(int i)
	{
		System.out.println("kumar");
		
	}
}
class B extends Abc
{
	public B()
	{
  //  super();
		System.out.println("racha");
	}
	public B(int i)
	{
		super(i);
		System.out.println("jagan");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
//	B obj=new B();
		B obj=new B(4);
		Abc obj1= new Abc();
		

	}

}
