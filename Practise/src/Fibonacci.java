
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; int b=1;int c;int d=0;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c=a+b);
		
		for(int i=1;i<=5;i++)
		{
			 
			c=a+b;
			
			System.out.println(c);
			a=b;
			b=c;
			

			
		}

	}

}
