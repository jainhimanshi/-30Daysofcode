package daysofcode;
import java.util.*;
public class Binary {
	    public static void main(String[] args) {
	    	        Scanner in = new Scanner(System.in);
	    	        int n = in.nextInt();
	    	        String x=Integer.toBinaryString(n);
	    	        int max=0;
	    	        for (String s : x.split("0"))
	    	        {
	    	        System.out.println(s);
	    	        if (s.length() > max)
	                    max = s.length();
	    	        }
				System.out.println(max);
	    }
}


