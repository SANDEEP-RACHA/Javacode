package fb;
class Asus extends Thread
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("hi");
		try{ Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

class Lg extends Thread
{
	public void run()
	{
for(int i=0;i<5;i++)
{
	System.out.println("hello");
	try{ Thread.sleep(500);} catch(Exception e) {}
}

	
}
}
public class Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asus obj =new Asus();
	   Lg obj2=new Lg();	
	   obj.start();
	   try{ Thread.sleep1(100);} catch(Exception e) {}
	   obj2.start();
	}

	//public static void sleep(int i) {
		// TODO Auto-generated method stub
		
	//}

	////public static void sleep1(int i) {
		// TODO Auto-generated method stub
		
//	}

// static void sleep2(int i) {
		// TODO Auto-generated method stub
		
//	}

	//public static void sleep2(int i) {
		// TODO Auto-generated method stub
		
//	}


	//public static void sleep(int i) {
		// TODO Auto-generated method stub
		
	
	//}
	//}

	
	
