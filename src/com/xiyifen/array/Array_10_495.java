package com.xiyifen.array;

/**
 * 每一次比较duration和timeSeries[i]-tiemSeries[i-1]的最小值
 */
public class Array_10_495 {

    public static void main(String[] args) {
        int[] a={1,2};
        int d=2;
        System.out.println(Array_10_495.findPoisonedDuration(a,d));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
     int sum=0;
     if(timeSeries.length==0) return 0;
     for(int i=1;i<timeSeries.length;i++) {
        if(timeSeries[i]-timeSeries[i-1]>duration){
            sum+=duration;
        }else {
            sum+=timeSeries[i]-timeSeries[i-1];
        }
     }

     return sum+duration;//加上durtion是数组的最后一个值之后的
    }

}
