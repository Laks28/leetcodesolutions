package leetcodesolutions.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 * Constraints:
 * - Each input will have exactly one solution.
 * - You may not use the same element twice.
 */
public class TwoSum {

    public static void main(String[] args) {

        int target = 9;
        int[] nums = {3, 1, 0, 5, 2, 4, 5, 2, 7};

        // Find and display the result
        int[] result = findTwoSumArray(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    /**
     * Finds two numbers in the array whose sum equals the target.
     *
     * Approach:
     * 1. Use a HashMap to store each element's value and its index.
     * 2. For each element in the array, calculate its complement (target - current element).
     * 3. Check if the complement exists in the HashMap:
     *    - If yes, return the indices of the current element and its complement.
     *    - If no, store the current element and its index in the HashMap.
     *
     * @param nums   Array of integers.
     * @param target Target sum.
     * @return Indices of the two numbers as an array.
     */
    public static int[] findTwoSumArray(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (hm.containsKey(complement)) {
                System.out.println("The indices are: " + hm.get(complement) + " and " + i);
                System.out.println("The values to sum are: " + complement + " and " + nums[i]);
                return new int[]{hm.get(complement), i};
            }

            // Add the current number and its index to the map
            hm.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution to two sum");
    }
}
