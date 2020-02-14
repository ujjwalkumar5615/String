import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String first = scanner.next();
		System.out.println("Enter Second String");
		String second = scanner.next();

		char[] first1 = first.toCharArray();
		Arrays.sort(first1);

		char[] second1 = second.toCharArray();
		Arrays.sort(second1);

		if (Arrays.equals(first1, second1)) {
			System.out.println("Anagram");
		}

		else {
			System.out.println("Not Anagram");
		}

	}

}
