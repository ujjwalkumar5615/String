import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String first = sc.next();
		System.out.println("Enter Second String");
		String Second = sc.next();
		System.out.println("Enter Third String");
		String third = sc.next();

		String Final = first.concat(Second);

		char[] Finals = Final.toCharArray();
		char[] third1 = third.toCharArray();

		Arrays.sort(Finals);
		Arrays.sort(third1);
		
		
		if(Arrays.equals(Finals, third1))
		{
			
			System.out.println("Third String Shuffle Of Two String");
		}
		
		else
		{
			System.out.println("Not Shuffle");
		}

	}

}
