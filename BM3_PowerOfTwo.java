package Bit_Manipulation;

public class BM3_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // Check if n is greater than 0 and apply the bit manipulation trick
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        int num = 16;
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
        int arr[] = {2,4,16,9,26,14,5,10,64,8};
        for(int i = 0;i<arr.length;i++){
            if(isPowerOfTwo(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
}