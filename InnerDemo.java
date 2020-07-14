package fb;
class Outer
{
	public void show()
	{
		System.out.println("SANDEEP");
	}
	class Inner    //Outer$Inner.class
	
	{


		public void display()
		{
			System.out.println("manoj");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method 
		Outer obj = new Outer();
		obj.show();

		Outer.Inner obj1=obj.new Inner();
		obj1.display();
	}

}
