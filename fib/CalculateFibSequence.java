import java.util.Scanner;

public class CalculateFibSequence {
	public static void calculate(double n) {
		int x = 0; 
		int y = 1;
		
		// the sum of the sequence 1+1=2, 2+1 = 3, 3+2 = 5, until n
		int z = 0; 
		
		while (x+y < n) {
			System.out.print(z + " ");
			
			z = x + y;
			
			// now change up the numbers... 
			y = x;
			x = z;
		}
		
		
	}
	
	// An alternative way of doing it(mostly syntactically, not algorithmically) 
	public static void calculateFib(double limit) { 
		int temp = 0;
		
		int[] elements = new int[(int) limit];
		
		elements[0] = 0; 
		elements[1] = 1;
		
		while (elements[1]+elements[0] <= limit) {
			temp = elements[0];
			
			elements[0] = elements[1];
			
			elements[1] = temp + elements[1];
			
			
			System.out.print(elements[1] + " ");
		}
		
	}
	
	public static void printOutputHeader() {
		System.out.println("Output:");
	}
	
	public static void printOutputFooter() {
		System.out.print("\n\n"); 
	}

	
	public static void showFibSequenceMethod1() {
		int sample1 = 4, sample2  = 35, sample3 = 5000;

		printOutputHeader();
		calculateFib(sample1);
		printOutputFooter();
		
		printOutputHeader();
		calculateFib(sample2);
		printOutputFooter();
		
		printOutputHeader();
		calculateFib(sample3);
		printOutputFooter();
		
		
		
	}
	
	public static void showFibSequenceMethod2() {
		int sample1 = 4, sample2  = 35, sample3 = 5000;

		printOutputHeader();
		calculateFib(sample1);
		printOutputFooter();
		
		printOutputHeader();
		calculateFib(sample2);
		printOutputFooter();
		
		printOutputHeader();
		calculateFib(sample3);
		printOutputFooter();
		
		
		
		
	}
	
	public static void main(String[] args) {
			
			showFibSequenceMethod1();
			
			showFibSequenceMethod2();
			
			
		
	}
}
