package AssignmentDay1;
import java.util.Scanner;
/**
 * @author sneha -display year leap or not.
 *
 */
	public class LeapYear {
		public class leapyr {
			 public static void main (String[] args) {
				 int year;
				 Scanner sc = new Scanner(System.in);
				 System.out.println ("Enter an year = ");
				 year = sc.nextInt();
				 if(((year % 4 == 0) && (year % 100!= 0)) || (year % 400 ==0))
					 System.out.println("Specified year is a leap year");
				 else
					 System.out.println("Specified year is not a leap year");
			}
		}
}