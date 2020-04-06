package hackerearth;
import java.util.*;
public class MagicalWord {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			String s=scan.nextLine();
			int n,i,j;
			for(i=0;i<s.length();i++)
			{
				 n=s.codePointAt(i);
				System.out.print(n+" ");
				n++;
			     for(j=2;j<n;j++)
			     {
			    	 if(n%j==0)
			    	 {
			    	System.out.println("not prime ");
			    	n++;
			    	System.out.print("final prime no is"+n+"\n");
			    	 break;
			         }
			      }
			     if(j==n){
			    	 System.out.print("final prime no is "+n+"\n");
			     }
		   }
			     
			
		}
	}

