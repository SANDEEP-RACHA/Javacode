package fb;
abstract class Aaab
{
	public abstract void aa();
	public void show()
	{

		
	}
	public void display()
	{

	}
}
class Aghj extends Aaab             //Concrete class
{
	public void aa()      //method name should be defined same as method declared in abstract class (aa)
	{
   System.out.println("sandeep");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aghj obj=new Aghj();
		obj.aa();
	}

}
	