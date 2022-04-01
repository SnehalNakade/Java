package AssignmentDay3;
/**
 * @author sneha-print the elements of an array in reverse order
 *
 */
public class Reverse {
	public static void main(String[] args) {  
        int [] arr = new int [] {22,33,46,12,6};   
        System.out.println("reverse order of elements of an array: " );
       // System.out.println(arr.length);
        for (int i = arr.length-1; i >= 0; i--) {
        		System.out.println(arr[i]);
        }	 
	}

}