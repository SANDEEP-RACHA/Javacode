package fb;

class Sandeep
{
	int i;
	int j;
	int k;

	public void perform()
	{
		k=i+j;
	}
}
public class NewObjectCode {

	public static void main(String args[])

	{ 
		  
		Sandeep obj = new Sandeep();
		obj.i=4;
		obj.j=4;
		obj.perform();
		System.out.println(obj.k);

	}

}

