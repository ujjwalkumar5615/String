import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Any String");
		String string=scanner.next();
		
		String lower=string.toLowerCase();
		
		for(int i=0; i<lower.length();i++) {
			
			
			char c=lower.charAt(i);
	
			
			if( c == 'a' || c =='e' || c=='i' || c=='o'|| c=='u')
			{
				System.out.println("Vowels  "+c);
				
			}
			
			else
			{
				System.out.println("Consonent  "+c);
			}
			
		}
		
	}
	
	
}
