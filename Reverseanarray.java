package daysofcode;
public class Reverseanarray {
public static void main(String[] args) {
		int array[]={1,4,3,2};
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
	  System.out.print(array[k]);
  }
	}
}
