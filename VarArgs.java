package fb;

public class VarArgs {
	public  int add(int ... n)

	{
		int sum=0;
		for(int i:n)
		{
			sum=sum + i;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgs obj=new VarArgs();
		obj.add(14,47,6565,788);
		System.out.println(obj.add(14,47,6565,788));
	}

}

