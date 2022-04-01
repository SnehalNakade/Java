package AssignmentDay2;
import java.util.Scanner;
/**
 * @author sneha - palindrome or not 
 *
 */
public class Palindrome {
	public static void main (String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter a num = ");
		 num = sc.nextInt();
		 int temp = num ;
		int rev =0 ;
		
		for (int i=0; i < num ; ) {
			int x= num % 10;
	    	rev = rev * 10 + x;
	    	num = num/10 ;	
		}
	    System.out.println(" " + rev);
	    if(temp == rev)
	    	System.out.println("palindrome");
	    else
	    	System.out.println(" not palindrome");  
	}
}
