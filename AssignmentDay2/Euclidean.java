package AssignmentDay2;
import java.util.Scanner;
/**
 * @author sneha -command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).Use Math.power function
 *
 */
public class Euclidean {
		public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter x and Y =");
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        double dist = Math.sqrt(x*x + y*y);
	        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	    }   
}