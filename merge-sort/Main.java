class Main {

  public static void mergeSort(int arr[]) {
    mergeSort(arr, 0, arr.length - 1);
  }

  public static void mergeSort(int[] arr, int left, int right) {
      if(left >= right) 
        return;

      int middle = (left + right) / 2;

      mergeSort(arr, left, middle);
      mergeSort(arr, middle + 1, right);  
      
      merge(arr, left, right);
  }

  public static void merge(int arr[], int left, int right) {
    int[] temp = new int[arr.length];

    int leftStart = left;
    int rightStart = 1 + ((right + left) / 2);

    int leftEnd = rightStart - 1;  
    int rightEnd = right; 

    int index = 0;
    int leftIndex = leftStart;
    int rightIndex = rightStart;

    while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
      
      if(arr[leftIndex] >= arr[rightIndex]) { 
          temp[index] = arr[leftIndex];
          leftIndex++;
      }

      else if(arr[rightIndex] >= arr[leftIndex]) { 
          temp[index] = arr[rightIndex];
          rightIndex++;
    }    

    index++;
  }

  int tmpIndex = index;

  for(int leftCounter = leftIndex; leftCounter <= leftEnd; leftCounter++) {
    temp[index] = arr[leftCounter];
    index++;
  }

  index = tmpIndex; 

  for(int rightCounter = rightIndex; rightCounter <= rightEnd; rightCounter++) {
    temp[index] = arr[rightCounter];
    index++;
  }


  int i = 0;
  for(int counter = left; counter <= rightEnd; counter++) {
      arr[counter] = temp[i];
      i++;
  }
}

  public static void main(String[] args) {
    
      // example code to see if list is being sorted... 

      int[] arr = new int[10];
      arr[0] = 4;
      arr[1] = 3;
      arr[2] = 9;
      arr[9] = 500000000;
      arr[3] = 6;
      arr[4] = 1;
      arr[5] = 4400;
      arr[6] = 0;
      arr[8] = 44345534;

      // sort list 
      mergeSort(arr);

      // display newly sorted list 
      // expected output: (500000, 44345534, 4400, 9, 6, 4, 3, 1, 0) 
      // we can reverse the order by simply changing the greater than sign (in the merge) with a less than sign 

      System.out.println();
      System.out.println();

      for(int i : arr) {
        System.out.println(i); 
      }

  }
}