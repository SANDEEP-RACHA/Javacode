package fb;

  class StaticKey3
  {

	int eid;
	static int salary;
	static String ceo;
	static int eaddr;
	
	static {
		ceo="suresh";
		System.out.println("Racha");
	}
	static 
	{
		eaddr=15664;
		System.out.println("sandeep");
	}
	public  void Show()
	
	{
		eid=1;
		salary=50000;
		System.out.println(eid+" : "+salary+" : "+ceo+" "+eaddr);
	}
  }
  
  public class StaticKey2
  {
	
  public static void main(String args[])
  {
	 
	  StaticKey3 san=new StaticKey3();
	 
	  StaticKey3 man= new StaticKey3();
	  san.Show();
	  man.Show();
  }
}

