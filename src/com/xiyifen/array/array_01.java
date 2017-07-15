package com.xiyifen.array;

import java.util.Arrays;

/**
 * Created by User on 2017/7/15.
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.

 Example 1:
 Input: [1,2,3]
 Output: 6
 Example 2:
 Input: [1,2,3,4]
 Output: 24
 Note:
 The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
public class array_01 {
    public static void main(String[] args) {
        int[] a={-1,-2,0,3,5};
        array_01 n=new array_01();
//        n.maximumProduct(a);
        System.out.println(n.maximumProduct(a));
    }

    /**
     *
     * @param a
     * @return 其中三个数字相乘的最大值
     * 有可能有负数
     */
    public int maximumProduct(int[] a){
        Arrays.sort(a);
        int len=a.length;
        int i=a[0]*a[1]*a[len-1];
       int j =a[len-1]*a[len-2]*a[len-3];
        return Math.max(i,j);
    }
}
