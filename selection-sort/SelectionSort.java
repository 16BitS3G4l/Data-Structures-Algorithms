
public class SelectionSort {
	
	public static void sort(double[] arr) {
		selectionSort(arr, 0, arr.length - 1);
	}
	
	// recursive helper method
	public static void selectionSort(double[] arr, int low, int high) {
		// let's exhaustive search the array from low to high(sublist) and selective sort recursively.
		if (low < high) {
		double min = arr[low]; 
		int indexOfMin = low;
		
		for(int j = low; j <= high; j++) {
			if(arr[j] < min) {
				min = arr[j];
				indexOfMin = j;
			}
		}
		
		arr[indexOfMin] = arr[low];
		arr[low] = min;
		
		selectionSort(arr, low+1, high);
		
		}
	}
	
	public static void displaySortedArray(double[] arr) {
		selectionSort(arr, 0, arr.length-1);
		
		for(double element : arr) {
			System.out.print(element + " ");
		}
		
		System.out.println();

	}
	
	public static void main(String[] args) {
		
		double[] sample = {9, 7, 1, 2, 3, 4, 5, 10, 6, 8};
		displaySortedArray(sample);
		
		/* Output of the above code 
		 * 
		 * 1 2 3 4 5 6 7 8 9 10 
		 * 
		 * It shouldn't take too long to confirm that this array has in fact been sorted. So it works. But what about
		 * in other situations? 
		 */
		
		double sample2[] = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2, 0}; 
		displaySortedArray(sample2);
		
		/* Output of the above code
		 * 
		 * 0 2 4 6 8 10 12 14 16 18 20
		 * 
		 * In this example, we took a different approach by using a sorted array which was descending in order. 
		 * We can see that that both types of arrays, one entirely unsorted, and the one presented directly above, 
		 * don't effect the sorting algorithms effectiveness. 
		 */
		
		double sample3[] = {3.23, 5, 9.1, 700, 99.3, 3.141592653, 3.1415999, 77.3, 55, 25, 32, 100};
		displaySortedArray(sample3);
		
		/*
		 * Output of this code: 
		 * 
		 * 3.141592653 3.1415999 3.23 5.0 9.1 25.0 32.0 55.0 77.3 99.3 100.0 700.0 
		 *
		 * You might have to spend (slightly) more time on this one, but in the end you'll see again that it is indeed sorted. Hurrah!
		 */
		
		
	}
}
