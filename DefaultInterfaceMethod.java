package fb;
interface Maruti
{ 
	void display();
	default void show()
	{
		System.out.println("sandeep");
	}
}
class Alto implements Maruti
{
	public void display()
	{
		System.out.println("Racha");
	}
	public void show()
	{
		System.out.println("jagan");
	}
}
public class DefaultInterfaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Alto obj=new Alto();
       obj.display();
       obj.show();
	}

}
