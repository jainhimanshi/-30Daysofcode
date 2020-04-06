package hackerearth;
import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
		String s, reverse = "";
	      Scanner scan = new Scanner(System.in);
	     s = scan.nextLine();
	 
	      for ( int i = s.length()-1; i >= 0; i-- )
	      {
	         reverse = reverse + s.charAt(i);
	      }
	      if (s.equals(reverse))
	         System.out.println("YES");
	      else
	         System.out.println("NO");
	 
	}

}
