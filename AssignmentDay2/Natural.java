package AssignmentDay2;
/**
 * @author sneha - sum of natural nos by while and for loop
 *
 */
public class Natural {
	public static void main (String[] args) {
		 int x = 5 ;
		 int i= 1 ;
		 int sum = 0 ;
//		 while (i<=x) {
//			 sum =sum + i;
//			 i++ ;
//		 }
		 for (i=1;i<=x;i++) {
			 sum+=i;	
			 }
		  System.out.println("The sum of first 5 natural numbers = " + sum);
	   }
}