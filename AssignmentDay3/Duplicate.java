package AssignmentDay3;
/**
 * @author sneha- print the duplicate elements of an array
 *
 */
public class Duplicate {
	  public static void main(String[] args) {
	        int[] array = {1, 2, 12, 5, 8, 67, 3, 2, 5, 12};
	        for (int i = 0; i < array.length-1; i++){
	            for (int j = i+1; j < array.length; j++) {
	                if ((array[i] == array[j]) && (i != j)) {
	                    System.out.println("Duplicate Element : "+ array[j]);
	                }
	            }
	        }
	    }    
}