package AssignmentDay3;
/**
 * @author sneha-  print the elements of an array present on an odd position
 *
 */
public class Odd {
	public static void main(String[] args) {  
        int [] arr = new int [] {22,33,46,12,6};   
        System.out.println("elements at odd position of an array: " );
        for (int i=0; i<arr.length;i++) {
        	if (i % 2 != 0)
        		System.out.println( arr[i]);
        }	 
      }
}