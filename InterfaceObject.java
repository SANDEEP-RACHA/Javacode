package fb;
  interface Bbb1{
	  void show();
  }
class 	Aab implements Bbb1{
	
		public void show() 
		{
			System.out.println("sandeep");
		}
	}

public class InterfaceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bbb1 obj = new Aab();
       obj.show();
	}

}

