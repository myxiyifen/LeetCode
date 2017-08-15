package com.xiyifen.array;


/**
 * 连续1的最大数
 *
 */
public class Array_07 {
    //[1,1,0,1,1,1,1]
    public static void main(String[] args) {
//        int[] a={1,1,0,1,1,1};
        int[] a={1,0,1,1,0,1};
        Array_07 array_07=new Array_07();
        System.out.println(array_07.findMaxConsecutiveOnes01(a));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,count=nums[i]==0?0:count+1);//count={num[i]==0?0:count+1};
        }
        return max;

    }
    public int findMaxConsecutiveOnes01(int[] nums) {
        int count=0;int max=0;
        for(int i=0;i<nums.length+1;i++){  //这里加+1的目的是为了最后进入else执行max语句
            if(i<nums.length&&nums[i]==1) count++;
            else {
                max=Math.max(max,count);
                count=0;
            }
        }
        return  max;
    }

}
