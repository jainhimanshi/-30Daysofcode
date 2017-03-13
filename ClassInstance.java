package daysofcode;
import java.io.*;
import java.util.*;
public class ClassInstance {
	    private int age;	
		public ClassInstance(int initialAge) 
		{
		        if (initialAge >= 0)
		        {
		            age = initialAge;
		        }
		        else
		        {
		           System.out.println("Age is not valid, setting age to 0.");
		            age=0;
		            }
		        }
		public void amIOld() {
	  		if(age<13){
	        System.out.println("you are young.");
	        }
	  		else if (age>=13&&age<18){
	  			System.out.println("you are teenager.");}
	  		else {
	  			System.out.println("you are old.");}
		}

		public void yearPasses() {
	  		age=age+1;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				ClassInstance p = new ClassInstance(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
	        }
			sc.close();
	    }
	}

