import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Any String");
		String sc=scanner.next();
		
		Set s=new HashSet<>();
		StringBuffer buffer=new StringBuffer();
		
         for(int i=0;i<sc.length();i++) {
        
        	 char c=sc.charAt(i);
        	
        	 if(!s.contains(c))
        	 {
        		 
        		 s.add(c);
        		
        		 
        	 }
        	 
        	 else
        	 {
        		
        		 buffer.append(c);
        	 }
         }
	
         System.out.println(buffer);
	}

}
