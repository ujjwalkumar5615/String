import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		Pattern pattern=Pattern.compile(".*[^0-9].*");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Digits");
		String string=sc.next();
		
		
		System.out.println(pattern.matcher(string).matches());
		
		
		
		
	}
	
	
}
