package fb;
class Aaaa
{
	int rollnum;
	String name;

	public void setRollnum(int r)
	{
		System.out.println("user is accesing");
		rollnum= r;

	}
	public int getRollnum()
	{
		System.out.println("value is changed");
		return rollnum;
	}
}


public class Encaps {
	public static void main(String arg[])
	{
		Aaaa obj =new Aaaa();
		obj.setRollnum(4);
		System.out.println(obj.getRollnum());
		
	}

}
