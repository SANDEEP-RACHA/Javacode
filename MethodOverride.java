package fb;
class Ant
{
	public void show()
	{
		System.out.println("Sandeep");
	}
}
class Def extends Ant
{
	
	public void show()
	{
		//super.show();
		
		System.out.println("racha");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Def obj = new Def();
		obj.show();

	}

}
