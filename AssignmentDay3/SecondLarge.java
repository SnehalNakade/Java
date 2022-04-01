package AssignmentDay3;
/**
 * @author sneha -2nd Largest Number in an Array
 *
 */
public class SecondLarge {
	public static void main(String[] args) {  
        int [] arr = new int [] {22,33,46,12,6};   
        for (int i=0; i<arr.length;i++) {
        	System.out.println(arr[i] + " ");
          }	
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                  int X = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = X;  
               }
            } 
        }
        System.out.println(); 
//        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
//            System.out.println(arr[i] + " "); 
            }  
        System.out.println("Second Largest Elements of array: " + arr[arr.length-2]); 
    }
}