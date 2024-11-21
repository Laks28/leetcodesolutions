package leetcodesolutions.Strings;

/**
 * Problem Statement:
 * Check if a given number is binary (contains only 0s and 1s).
 *
 * Constraints:
 * - The input number is given as an integer.
 * - The output should be a boolean indicating whether the number is binary.
 */
public class CheckNumberIsBinary {

    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 1010;

        System.out.println("The first number is binary: " + isBinary(num1));
        System.out.println("The second number is binary: " + isBinary(num2));
    }

    /**
     * Checks if a number is binary using a regular expression.
     * @param num The number to check.
     * @return true if the number is binary, false otherwise.
     */
    public static boolean isBinary(int num) {
        String regEx = "[01]+"; // Regular expression to match binary numbers
        return Integer.toString(num).matches(regEx);
    }
}
