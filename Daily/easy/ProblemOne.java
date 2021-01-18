package easy;

import java.util.HashMap;

/* 
    Problem Statement: 
        Given a list of numbers and a number k, return whether any two
        numbers from the list add up to k.
        For example, given [10, 15, 3, 7] and k of 17, return true
        since 10 + 7 is 17. 
*/

class ProblemOne {    
    
  // Time Complexity: O(n^2)
  public static boolean doesSumExistBruteForce(int k, int[] arr) {
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr.length; j++) {
            if(i == j) 
                continue;
            
            if(arr[i] + arr[j] == k) {
                return true;
            }
        }
    }

    return false;
  }
  
  // Time Complexity: O(n)
  public static boolean doesSumExist(int k, int[] arr) {
    HashMap<Integer, Boolean> map = new HashMap<>();

    for(int element : arr) {
        if( map.containsKey(element) ) {
            return true;
        } else {
            map.put((k - element), true);
        }
    }

    return false;
  }

    public static void main(String[] args) {
        
        // This is a test I used to showcase how much of a difference there exists between these two algorithms 

        int[] arrOneTest = new int[60000];
        
        for(int i = 0; i < arrOneTest.length; i++) {
            arrOneTest[i] = Math.round((long)Math.random()) * 1000;
        }

        System.out.println("Testing first way (linear): ");
        System.out.println(doesSumExist(45, arrOneTest));

        try {
            Thread.sleep(1500);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Testing second way (polynomial): ");
        System.out.println(doesSumExistBruteForce(45, arrOneTest));


    }

}
