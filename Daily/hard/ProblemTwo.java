package hard;

/*
    Problem Statement: 
    Given an array of integers, return a new array such that each element
    at index i of the new array is the product of all the numbers in the
    original array except the one at i .
*/

public class ProblemTwo {

    // Time Complexity: O(n)
    public static int[] multiplyAllOtherArrayElementsBesideElementIAtPositionI(int[] arr) {

        int totalMultiplication = 1;
        for(int i = 0; i < arr.length; i++) {
            totalMultiplication *= arr[i];
        }

        int[] result = new int[arr.length];

        for(int i = 0; i < result.length; i++) {
            result[i] = totalMultiplication / arr[i];
        }

        return result;
    }


    // Time Complexity: O(n^2)
    // This is a brute force solution to a case where division isn't allowed: 
    public static int[] multiplyAllOtherArrayElementsBesideElementIAtPositionIBruteForce(int[] arr) {

        int[] result = new int[arr.length];
        int totalMultiplication = 1;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i == j) {
                    continue;
                }

                totalMultiplication *= arr[j];
            }

            result[i] = totalMultiplication;
            totalMultiplication = 1;

        }


        return result;
    }


    // Time Complexity: O(n)
    // This is a linear time solution to a case where division isn't allowed: (more of a hack, it's pretty much division)
    public static int[] multiplyAllOtherArrayElementsBesideElementIAtPositionILinear(int[] arr) {
        int[] result = new int[arr.length];

        int totalMultiply = 1;
        for(int i = 0; i < arr.length; i++) {
            totalMultiply *= arr[i];
        }

        for(int i = 0; i < result.length; i++) {
            result[i] = totalMultiply * 1 / arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

    }
}