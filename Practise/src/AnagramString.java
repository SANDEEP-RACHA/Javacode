import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {

	
	public static boolean anagramcheck(String str1,String str2)
	{
		char[] charArrayFromString1=str1.toCharArray();
		char[] charArrayFromString2=str2.toCharArray();
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		
		
		
		return Arrays.equals(charArrayFromString1,charArrayFromString2);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          String str1="listen";
          String str2="silent";
          System.out.println("Both strings are anagram "+anagramcheck(str1,str2));
          
	}
}
