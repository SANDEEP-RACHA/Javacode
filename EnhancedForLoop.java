package fb;

public class EnhancedForLoop {
	public static void main(String args[])
	{
		
	
		
	int a[]= {25,45,78,96};
	
		for(int k : a)
		{
			System.out.println(k);
		}
		int b[][]= {
				{15,47,69,85},
				{47,96,96},
				{47,86,56,75,65},
				
		};
		for(int d[] : b)
		{
			for(int f:d)
			{
				System.out.print(" " +f+"       ");
			}
			System.out.println();
		}
		
		}
			
	}

	


