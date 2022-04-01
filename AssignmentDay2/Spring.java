package AssignmentDay2;
import java.util.Scanner;
/**
 * @author sneha -  program SpringSeason
 *
 */
public class Spring {
		public static void main(String[] args) { 
			Scanner sc =new Scanner(System.in);
			System.out.println("ENter the month and day= ");
	        int m = sc.nextInt();
	        int d = sc.nextInt();
	        
	        if((m == 3 && d >=20 && d <= 31) || (m == 4 && d >=  1 && d <= 30)|| (m == 5 && d >=  1 && d <= 31)
	                || (m == 6 && d >=  1 && d <= 20))
	        	System.out.println("its spring ");
	        else	
	        	System.out.println("its not spring ");
		}    
}