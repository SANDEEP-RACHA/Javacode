package fb;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
     System.out.println("enter a number");
     BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
     int n= Integer.parseInt(br.readLine());
     System.out.println(n);
	}

}
