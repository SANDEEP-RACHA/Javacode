package fb;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=5;
Integer ii=new Integer(i);         //boxing    wrapperclass
int j=ii.intValue();                 //unboxing
 Integer abc=i;                     //autoboxing
 int k=abc;            //auto unboxing
 System.out.println(k);
 System.out.println(58);



	}

}
