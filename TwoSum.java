package leetcodesolutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String args[]) {

        int target = 9;
        int[] arr = {3,1,0,5,2,4,5,2,7};
        int[] result = findTwoSumArray(arr,target);

    }

    public static int[] findTwoSumArray(int[] nums, int target) {

        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<=nums.length;i++) {
            int complement = target - nums[i];

            if(hm.containsKey(complement)) {
                System.out.println("The indices are: " +hm.get(complement) + " and " +i);
                System.out.println("The values to sum are: " +complement + " and " +nums[i]);
                return new int[] {hm.get(complement), i};
            }
            hm.put(nums[i],i);
        }

        throw new IllegalArgumentException("No solution to two sum");
    }
}
