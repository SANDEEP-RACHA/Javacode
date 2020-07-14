package fb;
class Aaa
{
	public void show()
	{
		System.out.println("racha");
	}
}
class Bbb extends Aaa
{
	public void show()
	{
		System.out.println("kumar");
	}
}
class Ccc extends Bbb
{
	public void show()
	{
		System.out.println("sandeep");
	}
}
public class MethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Aaa obj = new Bbb(); //runtime polyorphism
    obj.show();
    obj =new Ccc();   //Dynamic Method Dispatching
    obj.show();
	}

}
