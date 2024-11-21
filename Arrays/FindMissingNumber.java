package leetcodesolutions.Arrays;

/**
 * Problem: Find the Missing Number
 * Difficulty: Easy

 * Approach:
 * - Use XOR to find the missing number in an array of size n containing numbers from 0 to n.
 * - XOR is used because it cancels out duplicate numbers (A ^ A = 0, A ^ 0 = A).
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }

    /**
     * Finds the missing number in an array of size n containing numbers from 0 to n.
     */
    public static int findMissingNumber(int[] arr) {
        int allXOR = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= arr.length; i++) {
            allXOR ^= i;
        }

        // XOR all numbers in the array
        for (int num : arr) {
            allXOR ^= num;
        }

        return allXOR;
    }
}
