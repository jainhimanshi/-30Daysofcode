package daysofcode;
import java.util.*;
public class Factorialusingrecursion {
	    int fact(int n)
	    {
	        int result;
	       if(n==1)
	         return 1;
	       else
	       result = fact(n-1) * n;
	       return result;
	    }
	     public static void main(String args[])
	     {
	       Factorialusingrecursion  obj = new Factorialusingrecursion();
	       Scanner scan=new Scanner(System.in);
	       int n=scan.nextInt();
	       int a = obj.fact(n);
	       System.out.println(a);
	     }
	}

