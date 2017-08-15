package com.xiyifen.array;

import java.util.ArrayList;
import java.util.List;

public class Array_08_448 {

    public static void main(String[] args) {
        Array_08_448 array_08=new Array_08_448();
        int[] n={4,3,2,7,8,2,3,1};
        System.out.println(array_08.fingDisappearedNumbers02(n));
    }

    public List<Integer> fingDisappearedNumbers01(int[] nums) {


        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
        for (int i = 0; i < nums.length; i ++) if (nums[i] <= n) res.add(i+1);
        return res;

    }

    /**
     * 将数组里的值全部减1后作为数组的下标，并将对应的值取反
     * 此时值为负数所对应的数组下标都已出现过，
     * 所以值仍大于0的其所对应的下标消失。
     * @param nums
     * @return
     */
    public List<Integer> fingDisappearedNumbers02(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            int index = nums[i];
            if (nums[Math.abs(index)-1] > 0) {//恒为真
                nums[Math.abs(index)-1]=-nums[Math.abs(index)-1];
            }
        }
        for(int j=1;j<=nums.length;j++) {
            if (nums[j - 1] > 0) {
                res.add(j);
            }
        }
        return res;

    }
}
