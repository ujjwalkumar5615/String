import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String First = sc.next();
		System.out.println("Enter Second String");
		String Second = sc.next();

		String Final = "";

		for (int i = 0; i < Second.length(); i++) {

			char c = Second.charAt(i);

			for (int j = 0; j < First.length(); j++) {

				Final = Final.replaceAll(First, "" + c);

			}

		}
		System.out.println(Final);

	}

}
