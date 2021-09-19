/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

package com.PP.easy;

import java.util.HashMap;
import java.util.Map;

/*
TEST
    public static void main(String[] args) {
        int[] nums= new int[] {2,7,11,15};
        int target = 13;

        int [] solution = TwoSum.twoSumSolution(nums,target);
        System.out.println(Arrays.toString(solution));
    }
*/


public class TwoSum {

    public static int[] twoSumSolution(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("matches not found");
    }
}


/*
        for(int i = 0 ; i < nums.length; i++ ){
            for(int p = i + 1; p < nums.length; p++){
                int subtraction = target - nums[i];
                if(subtraction == nums[p])
                    return new int[]{i,p};
                }
        }
        throw new IllegalArgumentException("No match found");

The problem with this solution is that it runs at O(n^2) with small arrays it will run fast



*/

/*
Solution

We will use a hashmap to solve this problem.
We will create a for loop to iterate through the num array;
Every pass we will calculate the difference between target and current index value

diff + current index value = target;

This will be the value that we will try to find in the Hashmap;

If we dont find the value in the Hashmap and repeat the process with the next index.


 */