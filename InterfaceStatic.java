package fb;
interface Mahesh{
	int i=9;
	void show();
	
	static void kiran() {
		System.out.println("sandeep");
	}
	
}
class Suresh implements Mahesh
{
	//i=678;

	public void show()
	{
	// i=25;
			System.out.println("janu");
	}
}
public class InterfaceStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mahesh.kiran();
	}

}
