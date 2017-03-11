package daysofcode;
import java.util.*;
public class Reverseanarray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
		int array[]=new int[n];
		for(int x=0;x<n;x++){
			array[x]=scan.nextInt();
		}
		int temp=0;
		int i=0;
		int j=array.length-1;
		while(i<j)
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				j--;
				i++;
			}
  for(int k=0;k<array.length;k++){
	  System.out.print(array[k]+" ");
  }
	}
}
