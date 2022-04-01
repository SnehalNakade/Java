package AssignmentDay2;

/**
 * @author sneha - print reverse form of no. by while and for oop
 *
 */
public class Reverse {
	public static void main (String[] args) {
		int num = 123 ;
		int rev =0 ;
//	    while (num >=1) {
//	    	int x= num % 10;
//	    	rev = rev * 10 + x;
//	    	num = num/10 ;	
//	    }  
		for (int i=0; i < num ; ) {
			int x= num % 10;
	    	rev = rev * 10 + x;
	    	num = num/10 ;	
		}
	    System.out.println(" " + rev); 
	}
}