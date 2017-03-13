package daysofcode;
import java.util.*;
public class Factorial{
     public static void main(String args[])
     {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int result=1;
        if(n==1)
        	System.out.println("1");
        else
        	for(int i=1;i<=n;i++)
        	{
        	result=i*result;	
        	}
        System.out.println(result);
     }
}
