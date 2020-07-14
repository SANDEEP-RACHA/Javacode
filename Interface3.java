package fb;
interface Writer1
{

	 void write();
	}
	

class Pen3 implements Writer1
{
	public void write()
	{
		System.out.println("sandeep");
	}
	
}
class Pencil4 implements Writer1
{
	public void write()
	{
		System.out.println("uday");
	}
}
class Eraser2{
	public void run(Writer1 p)
{
   p.write();
}
}
public class Interface3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Eraser2 obj=new Eraser2();
     Writer1 w = new Pen3();
     Writer1 ab = new Pencil4
    		 ();
     obj.run(w);
     
     obj.run(ab);
     
	}

}

