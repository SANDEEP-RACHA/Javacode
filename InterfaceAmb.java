package fb;
interface Hero
{
	void abc();
	default void show()
	{
		System.out.println("SANDEEP");
	}
}
interface Honda
{
	default void show()
	{
		System.out.println("bharath");
			
	}
}
class Pulsar implements Hero,Honda
{
	public void abc()
	{
		System.out.println("nani");
	}
//	public void show()
//	{
//		System.out.println("srikanth");
//	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Honda.super.show();
	}
}
public class InterfaceAmb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Pulsar obj=new Pulsar();
     obj.abc();
     obj.show();
	}

}
