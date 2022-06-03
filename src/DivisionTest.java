import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionTest {
	
	public static void main(String[] args) {
		System.out.println("Begin main....");
		int x,y;
		Scanner s1 = new Scanner(System.in);
		try {
			x = s1.nextInt();
			y = s1.nextInt();
			int z = x/y;
			System.out.println("Z: "+z);
			s1.close();
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide By Zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Please provide valid Input");
		}
		
		
		/*int x=10;
		System.out.println("X: "+x);
		int y = 0;
		System.out.println("Y: "+y);
		if(y!=0) {
		int z = x/y;
		System.out.println("Z: "+z);
		}else {
			System.out.println("Cannot Divide By Zero..");
		}*/
		System.out.println("End main.....");
	}

}
