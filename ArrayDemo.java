
package fb;

public class ArrayDemo {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4};
		for(int i=0;i<4;i++)
		{
			System.out.print("  " + i);
		}
		System.out.println();
     
		int b[][]=
			{
				{1,2,3,4},
				{4,5,7,6},
		        {5,6,7,9},
			};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		  
		int c[][]=
			{
					{14,45,75,76},
					{1,15},
					{45,78,99},
					{47,58,9,32,14},
			};
		
		for(int i=0;i<4;i++)
		{
		for (int j=0;j<c[i].length;j++)
		{
			System.out.print(" "+c[i][j]+"       "          );
		}
		System.out.println();
		}
					
			}
		}
	
