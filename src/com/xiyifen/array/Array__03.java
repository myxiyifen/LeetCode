package com.xiyifen.array;

/**
 * Created by User on 2017/7/15.
 *
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

 You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

 The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

 If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

 Example 1:
 Input:
 nums =
 [[1,2],
 [3,4]]
 r = 1, c = 4
 Output:
 [[1,2,3,4]]
 Explanation:
 The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 Example 2:
 Input:
 nums =
 [[1,2],
 [3,4]]
 r = 2, c = 4
 Output:
 [[1,2],
 [3,4]]
 Explanation:
 There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
 Note:
 */
public class Array__03 {
    public static void main(String[] args) {
        int[][] nums={{1,2},{3,4},{5,6},{7,8}};
        int r=2,c=4;
        Array__03 array__03=new Array__03();
        int[][] res=array__03.matrixReshape(nums, r, c);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++)
        System.out.print(res[i][j]);

        }
    }
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n=nums.length;
        int m=nums[0].length;
        int k=m*n;
        if(k!=r*c){
            return nums;
        }
        int[][] res=new int[r][c];
        for(int i=0;i<r*c;i++) {  //0/1=0;1/3=0;0%4=0;1%4=1;
            res[i/c][i%c]=nums[i/m][i%m];
        }
         return res;
    }
}
