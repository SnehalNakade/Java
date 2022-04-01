package AssignmentDay2;
import java.util.Scanner;
/**
 * @author sneha - print a month
 *
 */
public class Switch2 {
	public static void main ( String[] args) {
			int num ;
			Scanner sc =new Scanner(System.in) ;
			System.out.println("Enter the the month num = ");
			num = sc.nextInt();
			switch(num) {
			 case 1 :
				System.out.println("Jan");
				break;
			 case 2 :
					System.out.println("feb");
					break;
			 case 3 :
					System.out.println("mar");
					break;
			 case 4 :
					System.out.println("april");
					break;
			 case 5 :
					System.out.println("may");
					break;
			 case 6 :
					System.out.println("june");
					break;
			 case 7 :
					System.out.println("july");
					break;
			 case 8 :
					System.out.println("aug");
					break;
			 case 9 :
					System.out.println("sept");
					break;
			 case 10 :
					System.out.println("oct");
					break;
			 case 11 :
					System.out.println("nov");
					break;
			 case 12 :
					System.out.println("Dec");
					break;
			 default:
				   System.out.println("invalid num");
				   break;
			}
		}
}