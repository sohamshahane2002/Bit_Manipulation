package Bit_Manipulation;

public class BM8_XorLtoR {

    // Function to compute XOR from 1 to n using the pattern
    public static int xorFrom1ToN(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }

    // Function to find XOR of numbers from L to R
    public static int xorLtoR(int L, int R) {
        return xorFrom1ToN(R) ^ xorFrom1ToN(L - 1);
    }
    public static void main(String[] args) {
        int L = 5;  // Starting number of the range
        int R = 8;  // Ending number of the range    
        System.out.println("XOR from " + L + " to " + R + " is: " + xorLtoR(L, R));
    }
}