package AssignmentDay3;
/**
 * @author sneha - print the largest element in an array
 *
 */
public class Largestno {
	public static void main(String[] args) {  
        int [] arr = new int [] {22,33,46,12,6};   
        int max =arr[0];
        for (int i=0; i<arr.length;i++) {
        	if (arr[i] > max)
        		max = arr[i];
        }	
        System.out.println("Largest Elements of an array: " + max);
      }
}