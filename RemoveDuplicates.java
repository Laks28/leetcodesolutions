package leetcodesolutions;

/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once
and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array
in-place with O(1) extra memory.
 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3,4,4,5};
        System.out.println("The length of old array is:" + nums.length);
        int result = findDuplicates(nums);
        System.out.println("The length of new array is:" + result);
    }

    public static int findDuplicates(int[] nums) {

        int i = 0;
        for (int j = 1; j < nums.length-1; j++) {
            if (nums[i] != nums[j]) {
                ++i;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
