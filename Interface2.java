package fb;
abstract class Writer
{

	public abstract void write();
	}
	

class Pen2 extends Writer
{
	public void write()
	{
		System.out.println("sandeep");
	}
	
}
class Pencil3 extends Writer
{
	public void write()
	{
		System.out.println("uday");
	}
}
class Eraser1{
	public void run(Writer p)
{
   p.write();
}
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Eraser1 obj=new Eraser1();
     Writer w = new Pen2();
     Writer ab = new Pencil3();
     obj.run(w);
     
     obj.run(ab);
     
	}

}

