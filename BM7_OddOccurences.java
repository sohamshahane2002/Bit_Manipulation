package Bit_Manipulation;

public class BM7_OddOccurences {

    // Function to find the number that appears an odd number of times
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        
        // XOR all elements in the array
        for (int num : arr) {
            result ^= num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3}; 
        System.out.println("The number that appears odd number of times is: " + findOddOccurrence(arr));
    }
}