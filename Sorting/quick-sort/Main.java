class Main {

  // doing quick sort

  // step 1: get pivot (let's assume it's the last element)
  // step 2: partition the array/collection
  // step 3: quickSort on leftSide
  // step 4: quickSort on rightSide

  // helper method for quickSort (recursive)
  public static void quickSort(int arr[]) {
    quickSort(arr, 0, arr.length - 1);
  }

  public static void quickSort(int arr[], int start, int end) {
    if(start >= end) {
      return;
    }

    // get pivot element's value for partitioning
    int pivot = arr[end];

    int pivotCorrectIndex = partition(arr, start, end, pivot);
  
    // left quickSort (less than or equal side)
    quickSort(arr, 0, pivotCorrectIndex - 1);

    // right quickSort (greater than side)
    quickSort(arr, pivotCorrectIndex + 1, end);
  }

  public static int partition(int arr[], int start, int end, int pivot) {
    int i = -1;

    System.out.println(pivot);
    
    for(int j = 0; j < end; j++) {
        if(arr[j] <= pivot) {
            i++;
            // swap elements jth and ith 
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;    
        }

        else if(arr[j] > pivot) {
          continue;
        }
    }

    // swap the ith + 1 with the pivot 
    int temp = arr[i+1];
    arr[i+1] = pivot;
    arr[end] = temp;

    return i+1;
  }

  public static void main(String[] args) {
      int[] arr = new int[4];
      arr[0] = 1;
      arr[1] = 1;
      arr[2] = 2;
      arr[3] = 5;
      // sort list 
      quickSort(arr);

      // display newly sorted list 
      // expected output: (1, 3, 4, 9)
      System.out.println();
      System.out.println();

      for(int i : arr) {
        System.out.println(i); 
      }
  }
}