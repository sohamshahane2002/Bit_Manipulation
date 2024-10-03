package Bit_Manipulation;

public class BM2_OddCheck {

    public static boolean isOdd(int number) {
        // Perform bitwise AND with 1 to check the least significant bit
        return (number & 1) != 0;
    }

    public static void main(String[] args) {
        int number = 7;

        if (isOdd(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }
    }
}