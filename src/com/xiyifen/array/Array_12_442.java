package com.xiyifen.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements that appear twice in this array.

 Could you do it without extra space and in O(n) runtime?

 Example:
 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [2,3]
 */
public class Array_12_442 {
    public static void main(String[] args) {
        Array_12_442 array_12_442 = new Array_12_442();
//        int[] nums = {1,1};
//        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1, 2};
        int[] nums={10,2,5,10,9,1,1,4,3,7};
        List<Integer> duplicates = array_12_442.findDuplicates(nums);
        System.out.println(duplicates);
    }

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        if (nums.length<2){
            return list;
        }
        if (nums.length == 2 && nums[0] == nums[1]) {
            list.add(nums[0]);
        }
       else  {
            if (nums[nums.length-2]==nums[nums.length-1]){
            list.add(nums[nums.length-1]);
        }
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == nums[i + 1] && nums[i] != nums[i + 2]) {
                    list.add(nums[i]);
//                    if (i<=nums.length-2) {
                        i = i + 1;
//                    }
                }
            }


        }
        return list;
    }
}

