package Bit_Manipulation;
public class BM6_CountBitToFlip {

    // Function to count the number of bits to be flipped to convert A to B
    public static int countBitsToFlip(int A, int B) {
        // XOR of A and B will give us the positions where bits differ
        int xorResult = A ^ B;

        // Count the number of 1's in xorResult (i.e., the number of bits to flip)
        int count = 0;

        while (xorResult != 0) {
            // Increment count for each bit that is set to 1
            count += xorResult & 1;  // Check the last bit
            xorResult >>= 1;         // Right shift the result to check the next bit
        }

        return count;
    }
    public static void main(String[] args) {
        int A = 29;  // Example: 11101 in binary
        int B = 15;  // Example: 01111 in binary

        System.out.println("Number of bits to be flipped: " + countBitsToFlip(A, B));
    }
}