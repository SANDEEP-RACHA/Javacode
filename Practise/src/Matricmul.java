
public class Matricmul {
	public static void main(String args[])
	{
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{1,1},{2,2},{3,3}};
		int c[][]= new int[3][2];
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)

			{
				//c[i][j]=0;
				for(int k=0;k<3;k++)
				{
					sum=sum+a[i][k]*b[k][j];

				}
				c[i][j]=sum;
				sum=0;
				System.out.print(c[i][j]+"  ");

			}
			System.out.println();
		}

	}
}

