
public class Demo {

	public static void main(String[] args) {

		String s1 = "";
		String s = new String("madam");

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			s1 = s1 + c;
		}

		if (s1.equals(s)) {
			System.out.println("Palindrome");
		}

		else {
			System.out.println("Not Palindrome");
		}
	}

}
