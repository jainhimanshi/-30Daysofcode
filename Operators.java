package daysofcode;
import java.util.*;
import java.math.*;
public class Operators {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double mealcost=scan.nextDouble();
		int tippercent=scan.nextInt();
		int taxpercent=scan.nextInt();
		scan.close();
		double tip=(mealcost*tippercent)/100;
		double tax=(mealcost*taxpercent)/100;
		double  Totalcost=mealcost+tip+tax;
		System.out.println(Math.round(Totalcost));

	}

}
