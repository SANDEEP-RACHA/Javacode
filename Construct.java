package fb;

class Construct 
{
	int abc;
	int def;
	int ghi;
	public Construct()
	{
		//		abc=4;
		//		def=7;
		//		ghi=99;
		//		
	}
	public Construct(double d, int n)
	{
		def=(int)d;
		ghi=n;
	}
	public static void main(String args[])
	{
		Construct obj= new Construct(56.8,6);
		System.out.println(obj.def);
		System.out.println(obj.ghi);
	}
}


