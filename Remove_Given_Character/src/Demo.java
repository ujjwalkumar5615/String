import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any String");
		String first = scanner.nextLine();

		System.out.println("Enter a Charcter We Want To Remove");
	    String Char=scanner.next();
	    
	    String Final=first.replace(Char, "");
	    
	    System.out.println("Final String After Remove-->"+Final);
	    
		
		
		
	}

}
