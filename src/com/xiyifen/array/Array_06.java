package com.xiyifen.array;

/**
 * Created by User on 2017/7/18.
 */

/**
 * 给定k，找长为k的子数组，其平均值最大
 */
public class Array_06 {
    public static void main(String[] args) {
        int[] n={1,12,-5,-6,50,3};
        int k=4;
        Array_06 array_06=new Array_06();
        System.out.println(array_06.findMaxAverage(n,k));
    }

    public double findMaxAverage(int[] nums,int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {

            sum += nums[i];
        }
        double max=sum;
       for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];//中间不动，拿最后一个减第一个。
            max=Math.max(sum,max);
       }
       return max/k;
    }
}
