
package fb;
class Aaaaa
{
   private 	int rollnum;
	private String name;
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
		System.out.println("value of num is changed");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}


public class Encaps2 {
	public static void main(String arg[])
	{
		Aaaaa obj =new Aaaaa();
		obj.setRollnum(4);
		obj.setName("sandeep");
		System.out.println(obj.getRollnum());
		System.out.println(obj.getName());
		
	}

}
