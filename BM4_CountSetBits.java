package Bit_Manipulation;

public class BM4_CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);  // Clear the rightmost set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 29;  // Example number
        System.out.println("Number of set bits in " + num + " = " + countSetBits(num));
    }
}
