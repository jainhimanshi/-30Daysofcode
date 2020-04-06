package hackerearth;
import java.util.*;
public class FindProduct {
	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int size=scan.nextInt();
	  long A[]=new long[size];
	long answer=1;
	 for(int i=0;i<size;i++)
	 {
		 A[i]=scan.nextInt();
	 }
       for(int k=0;k<size;k++)
       {
    	     answer=(answer*A[k])%1000000007;
       }
       System.out.println(answer);
	}

}
