package Bit_Manipulation;

public class BM5_SwapNums {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Before Swapping : "+a+" "+b);
         // Step 1: a = a ^ b
         a = a ^ b;

         // Step 2: b = a ^ b (this makes b hold the original value of a)
         b = a ^ b;
 
         // Step 3: a = a ^ b (this makes a hold the original value of b)
         a = a ^ b;
        System.out.println("After Swapping : "+a+" "+b);
    }
}
