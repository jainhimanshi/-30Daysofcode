package daysofcode;
public class letsreview {
public static void main(String[]args){
	String s="Hacker";
	int n;
    for(n=0;n<s.length();n++)
	{
		if(n%2==0)
	System.out.print(s.charAt(n));
	}
    System.out.print("  ");   
    for(n=1;n<s.length();n++)
    {
    if(!(n%2==0)) 
    	System.out.print(s.charAt(n));   	  		
    }
    System.out.println();
    String x="Rank";
    int i;
    for(i=0;i<x.length();i++)
	{
		if(i%2==0)
	System.out.print(x.charAt(i));
	}
    System.out.print("  ");   
    for(i=1;i<x.length();i++)
    {
    if(!(i%2==0)) 
    	System.out.print(x.charAt(i));   	  		
    }
    
    
    
}
}