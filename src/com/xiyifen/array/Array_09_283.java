package com.xiyifen.array;

public class Array_09_283 {
    public static void main(String[] args) {
        int[] a={1,0,3,5,0,8,0};
        Array_09_283 array_09_283=new Array_09_283();

        array_09_283.moveZeroes(a);
        for(int b:a) {
            System.out.print(b+" ");
        }
    }
    public void moveZeroes(int[] nums) {
       for (int i=0;i<nums.length;i++) {
               if(nums[i] == 0){
                   for(int j=i+1;j<nums.length;j++){
                       if(nums[j] != 0){
                           nums[i]=nums[j];
                           nums[j]=0;
                           break;//直接跳到第一个for循环
                       }
                   }
               }
           }
       }

}
