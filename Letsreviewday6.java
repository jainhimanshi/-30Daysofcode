package daysofcode;
import java.util.Scanner;
public class Letsreviewday6 {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		String y=scan.nextLine();
		int z;
	    for(z=0;z<y.length();z++)
		{
			if(z%2==0)
		System.out.print(y.charAt(z));
		}
	    System.out.print(" ");   
	    for(z=1;z<y.length();z++)
	    {
	    if(!(z%2==0)) 
	    	System.out.print(y.charAt(z));   	  		
	    }
	}
}