package com.xiyifen.array;

/**
 * Created by User on 2017/7/17.
 *
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

 You need to find the shortest such subarray and output its length.

 Example 1:
 Input: [2, 6, 4, 8, 10, 9, 15]
 Output: 5
 Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 Note:
 Then length of the input array is in range [1, 10,000].
 The input array may contain duplicates, so ascending order here means <=.
 */
public class Array_04 {
    public static void main(String[] args) {
        int[] nums={1,3,5,12,6,25,26};
        Array_04 array_04=new Array_04();
        System.out.println(array_04.findUnsortedSubarray(nums));
    }

    /**
     *
     * @param nums
     * @return 需排序的子数组的长度
     *
     */
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[n-1],beg=-1,end=-2;

        for (int i=1;i<nums.length;i++) {
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[n-1-i]);
            if(nums[i]<max){
                end=i; //2 3 5 4 15 6 16
            }
            if(nums[n-1-i]>min){
                beg=n-1-i;
            }
        }
        return end-beg+1;
    }

}
