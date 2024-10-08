package Bit_Manipulation;
import java.util.*;
public class BM9_PowerSet {
    public static List<List<Integer>> generatePowerSet(int[] set) {
        int n = set.length;
        int powerSetSize = 1 << n;  // 2^n
        List<List<Integer>> powerSet = new ArrayList<>();
        // Iterate over all possible subsets (from 0 to 2^n - 1)
        for (int i = 0; i < powerSetSize; i++) {
            List<Integer> subset = new ArrayList<>();
            
            // Check each bit of i (i.e., the binary representation of the current subset)
            for (int j = 0; j < n; j++) {
                // If the j-th bit of i is 1, include set[j] in the subset
                if ((i & (1 << j)) != 0) {
                    subset.add(set[j]);
                }
            }
            // Add the generated subset to the power set
            powerSet.add(subset);
        } 
        return powerSet;
    }
    public static void main(String[] args) {
        int[] set = {1, 2, 3};  // Example set
        List<List<Integer>> powerSet = generatePowerSet(set);
        for (List<Integer> subset : powerSet) {
            System.out.println(subset);
        }
    }
}
