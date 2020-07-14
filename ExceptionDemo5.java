package fb;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j;
      i=8;
      j=4;
      try 
      {                                                        //creating own exception
      int k=i/j;
      if (k==0)
    	  throw new SandeepException("this is not possible");
      System.out.println(k);
      
	}
      catch(SandeepException e)
      {
    	  System.out.println("error"+e.getMessage());
      }
      
      
      
}
}
