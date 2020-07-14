
package fb;

public class StaticKey {
	int eid;
	static int salary;
	static String ceo;
	static {
		ceo="sagar";
	}
	
	public void Show1()
	
	{
		eid=1;
		salary=20000;
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
  public static void main(String args[])
  {
	  StaticKey san=new StaticKey();
	  StaticKey man= new StaticKey();
	  san.Show1();
	  man.Show1();
  }
}
