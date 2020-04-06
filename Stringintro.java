package hackerrank;
public class Stringintro {
	public static void main(String[] args) {
		String A="hello";
		String B="java";
		int n=A.length()+B.length();
		System.out.println(n);
		 //When char are different, we get difference of ASCII value of first no. which is different.
           System.out.println(A.compareTo(B)>0?"yes":"No");
		
              //capitalize first letter
		 System.out.print(A.replaceFirst(A,"Hello"));
		 System.out.print(" "+B.replaceFirst(B, "Java"));
	}

}
