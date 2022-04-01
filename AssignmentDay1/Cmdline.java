package AssignmentDay1;
/**
 * @author sneha- Addition in command line
 *
 */
public class Cmdline {
	public static void main (String[] Values) {
		int sum=0 ;
		for (int i= 0 ;i < Values.length;i++) {
			sum += Integer.parseInt(Values[i]);
		}
		System.out.println(sum);
	}	
}
