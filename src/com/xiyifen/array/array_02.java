package com.xiyifen.array;

/**
 * Created by User on 2017/7/15.
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

 Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

 Example 1:
 Input: flowerbed = [1,0,0,0,1], n = 1
 Output: True
 Example 2:
 Input: flowerbed = [1,0,0,0,1], n = 2
 Output: False
 */

/**
 * 不能相连的花
 */
public class array_02 {
    public static void main(String[] args) {
        int[] a={0,0,0};
        int n=1;
        array_02 array_02=new array_02();
        System.out.println(array_02.canPlaceFlowers(a,n));
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int count=0;
       for(int i=0;i<flowerbed.length;i++) {
           if (flowerbed[i] == 0) {//第一和最后特殊
               int next=(i==flowerbed.length-1)?0:flowerbed[i+1];//如果i是最后一个元素，在后面补一个0
               int prv=(i==0)?0:flowerbed[i-1];     //i是第一个元素，在前面补0.
             if ((next==0&&prv==0)){
                 flowerbed[i]=1;
                 count++;
             }
           }

       }
       return count>=n;
    }
}
