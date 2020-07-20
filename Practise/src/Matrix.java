public class Matrix{
	public static void main(String args[]){
		//creating two matrices  
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};  
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};  

		//creating another matrix to store the multiplication of two matrices  
		int c[][]=new int[3][3];  //3 rows and 3 columns
		int sum=0;
		//multiplying and printing multiplication of 2 matrices  
		for(int i=0;i<3;i++){  
			for(int j=0;j<3;j++){    
				for(int k=0;k<3;k++)    
				{    
					sum=sum+a[i][k]*b[k][j];    
				}//end of k loop
				c[i][j]=sum;
				sum=0;
				System.out.print(c[i][j]+" ");  //printing matrix element
			}//end of j loop
			System.out.println();//new line  
		}  
	}}
