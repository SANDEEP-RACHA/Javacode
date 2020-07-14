package fb;
class Pencil
{
	public void show(Number i)
	{
		System.out.println(i);
	}
//	public void show(int i)
//	{
//		System.out.println(i);  instead of using two methods we use one method which accepts all the sub class method (use of abstract class)
//	}
//	public void show(double i)
//	{
//		System.out.println(i);
//	}
}
public class AbstractClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f;
		Pencil obj=new Pencil();
		obj.show(25556.5f);
	}

}
