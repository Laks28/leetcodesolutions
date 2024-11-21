package leetcodesolutions.Strings;

/**
 * Problem Statement:
 * Given an integer, return its reverse.

 * Constraints:
 * - Negative integers should also be reversed (e.g., -123 becomes -321).
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("The reverse of the number is: " + reverseInteger(num));
    }

    /**
     * Reverses an integer.

     * @param num The integer to reverse.
     * @return The reversed integer.
     */
    public static int reverseInteger(int num) {
        int rev = 0;

        while (num != 0) {
            int temp = num % 10; // Extract the last digit
            rev = rev * 10 + temp; // Append it to the reverse
            num /= 10; // Remove the last digit from the original number
        }

        return rev;
    }
}
