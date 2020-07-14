package fb;
class Google implements Runnable
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("hi");
		try{ Thread.sleep1(500);} catch(Exception e) {}
		}
	}
}

class Mozilla implements Runnable
{
	public void run()
	{
for(int i=0;i<5;i++)
{
	System.out.println("hello");
	try{ Thread.sleep2(500);} catch(Exception e) {}
}

	
}
}
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable obj =new Google();
	   Runnable obj2=new Mozilla();	
	   Thread t1=new Thread();
	   Thread t2=new Thread();
	   t1.start(obj);
	   t2.start(obj1);
	  
	}


	public static void sleep(int i) {
		// TODO Auto-generated method stub
		
	
	}
	}

	
	
