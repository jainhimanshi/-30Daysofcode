package hackerearth;
import java.util.Scanner;
public class RoyAndProfilePicture {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long l=scan.nextLong();
		int N=scan.nextInt();
		long h=0;
		long w=0;
		for(int i=0;i<N;i++)
		{
		 h=scan.nextLong();
		 w=scan.nextLong();
		if(w<l||h<l)
			System.out.println("UPLOAD ANOTHER");
		else if(w>l&&h>l)
		System.out.println("CROP IT");
		else if ((w==l)&&(h==l))
				System.out.println("ACCEPTED");
		}
		}
		}
	
