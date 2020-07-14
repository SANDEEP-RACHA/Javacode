package fb;

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1=new Runnable()
				{
			public void run()
			{
			for(int i=0;i<5;i++)
			{
				System.out.println("hi");
				try{ Thread.sleep1(500);} catch(Exception e) {}
				}
			}
		
				};
				
Runnable obj2= new Runnable()
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("hello");
		try{ Thread.sleep2(500);} catch(Exception e) {}
		}
	}

		};
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.run();
		

}
	
}


