package hackerearth;
import java.util.*;
public class ToggleString {
	public static void main(String[]args)
    { 
		Scanner scan=new Scanner(System.in);
        String str =scan.nextLine();
        String t = "";
        for (int x = 0; x < str.length(); x++)
        {  
            char c = str.charAt(x);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                t = t+Character.toLowerCase(c);
            else
                t = t+ Character.toUpperCase(c);
        }
        System.out.println (t);
    }

}
