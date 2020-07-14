package fb;

class Construct2 
{

		int abc;
		int def;
		int ghi;
		public Construct2()
		{
			//		abc=4;
			//		def=7;
			//		ghi=99;
			//		
		}
		public Construct2(int def, int ghi)
		{
			this.def=def;
			this.ghi=ghi;
		}

		public static void main(String args[])
		{ 
			Construct2 obj= new Construct2(99,565);
			System.out.println(obj.def);
			System.out.println(obj.ghi);
		}
	}


