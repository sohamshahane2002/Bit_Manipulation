package Bit_Manipulation;
public class BM1_BitCheck 
{
    public static boolean isBitSet(int number, int i) {
        // Shift 1 to the left by i positions and perform bitwise AND with number
        return (number & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        int number = 5; // binary representation: 101
        int i = 2;

        if (isBitSet(number, i)) {
            System.out.println("The " + i + "-th bit is set.");
        } else {
            System.out.println("The " + i + "-th bit is not set.");
        }
    }
}