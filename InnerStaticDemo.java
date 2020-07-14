package fb;
class Outer1
{
	static int a;
	public  void show()
	{
		System.out.println('2');
	}
	static class Inner1
	{
		public static void display()
		{
			System.out.println("2");
		}
	}
}

public class InnerStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Outer1 obj = new Outer1();
       obj.show();
       Outer1.Inner1 obj1= new Outer1.Inner1();
       obj1.display();
	}

}
