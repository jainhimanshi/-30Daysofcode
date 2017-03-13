package daysofcode;
import java.util.*;
public class Binarynotest2 {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			String x=Integer.toBinaryString(n);
	        for(int i=0;i<x.length();)
	        {
	        	if(x.charAt(i)==x.charAt(i+1))
	               System.out.println((int)Math.pow(2, i+1));        
	        	else
	        		System.out.println((int)Math.max(1,0));
	        	break;
	        }

	        
		}

	}
