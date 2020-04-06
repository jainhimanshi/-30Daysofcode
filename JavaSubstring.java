package hackerearth;
import java.util.*;
public class JavaSubstring {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int start=scan.nextInt();
		int end=scan.nextInt();
		for(int i=start;i<=end-1;i++)
		{
			System.out.print(s.charAt(i));
		}

	}

}
