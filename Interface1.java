package fb;
class Pen
{
	public void write()
	{
		System.out.println("sandeep");
	}
	
}
class Pencil2
{
	public void write()
	{
		System.out.println("uday");
	}
}
class Eraser{
	public void run(Pen p)
{
   p.write();
}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Eraser obj=new Eraser();
     Pen d= new Pen();
     
     obj.run(d);
     
	}

}
