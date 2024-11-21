package leetcodesolutions.Arrays;

/**
 * Problem Statement:
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once
 * and return the new length.
 * Constraints:
 * - Do not allocate extra space for another array; modify the input array in-place.
 * - Use O(1) extra memory.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        System.out.println("Original length of the array: " + nums.length);

        // Find and print the length of the array after removing duplicates
        int result = removeDuplicates(nums);

        System.out.println("New length of the array: " + result);
        System.out.print("Modified array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    /**
     * Removes duplicates from a sorted array in-place and returns the new length.
     *
     * Approach:
     * 1. Use two pointers:
     *    - `i` tracks the index of the last unique element.
     *    - `j` iterates through the array.
     * 2. Compare the current element with the last unique element:
     *    - If different, move the `j`-th element to the `i+1` position and increment `i`.
     * 3. Return `i + 1` as the new length of the array.
     *
     * @param nums Input sorted array.
     * @return New length of the array with unique elements.
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            // Check if the current element is different from the last unique element
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
