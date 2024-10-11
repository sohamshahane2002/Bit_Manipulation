package Bit_Manipulation;
public class BM10_SieveOfEratosthenes {
    // Function to set a bit at the given position
    public static void setBit(int[] bitArray, int index) {
        bitArray[index / 32] |= (1 << (index % 32)); // Set the bit at index % 32
    }
    // Function to check if a bit is set at the given position
    public static boolean isBitSet(int[] bitArray, int index) {
        return (bitArray[index / 32] & (1 << (index % 32))) != 0; // Check if the bit at index % 32 is set
    }
    // Function to perform the Sieve of Eratosthenes with bit manipulation
    public static void sieveOfEratosthenes(int n) {
        // Create a bit array to mark non-prime numbers
        int size = (n / 32) + 1; // Each int holds 32 bits
        int[] bitArray = new int[size];
        // Mark 0 and 1 as non-prime
        setBit(bitArray, 0);
        setBit(bitArray, 1);
        // Perform the sieve
        for (int i = 2; i * i <= n; i++) {
            if (!isBitSet(bitArray, i)) { // If i is a prime
                // Mark all multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    setBit(bitArray, j);
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (!isBitSet(bitArray, i)) { // If i is still marked as prime
                System.out.print(i + " ");
            }}}
    public static void main(String[] args) {
        int n = 100; // Find primes up to 100
        sieveOfEratosthenes(n);
    }
}
