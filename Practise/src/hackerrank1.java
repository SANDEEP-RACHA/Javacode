import java.util.*;
public class hackerrank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n%2==1)
		{
			System.out.println("Weird");
		}
		else
		{
			if(n>1&&n<7)
			{
				if(n%2==0)
				{
				System.out.println("Not Weird");
				}
			}
			else if(n>5&&n<21)
			{
				if(n%2==0)
				{
				System.out.println("Weird");
			}
					
		}
			else
			{
				if(n%2==0)
				{
				System.out.println("Weird");
			}
		
	}
		}
}
}
