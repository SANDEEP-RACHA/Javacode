import java.util.*;
public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean isPrime = false ;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isPrime = false;
				//break;
			}
		}
		if(isPrime==true)
		{
			System.out.println(n+ "  is prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

}
