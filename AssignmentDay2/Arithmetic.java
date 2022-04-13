package AssignmentDay2;
/**
* @author Snehal Nakade - Arithmetic operations
*
*/
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int a, b, c;
		int ch;
		Scanner s = new Scanner(System.in);

		System.out.println("1) a+b*c    2) c+a/b   3) a%b+c   4) a*b+c");
		System.out.println("Enter Your Choice :");
		ch = s.nextInt();

		System.out.println("Enter the first number : ");
		a = s.nextInt();
		System.out.println("Enter the second number : ");
		b = s.nextInt();
		System.out.println("Enter the third number : ");
		c = s.nextInt();
		s.close(); 

		switch (ch) {
		case 1:
			int result1 = a + b * c;
			System.out.println("Result of operation a+b*c :" + result1);
			break;

		case 2:
			int result2 = c + a / b;
			System.out.println("Result of operation c+a/b :" + result2);
			break;

		case 3:
			int result3 = a % b + c;
			System.out.println("Result of operation a%b+c :" + result3);
			break;

		case 4:
			int result4 = a * b + c;
			System.out.println("Result of operation a*b+c :" + result4);
			break;
		}
	}
}
