package lhq.train.Offer04;

import java.util.HashSet;

public class Demo {
/*    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean res = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(target == matrix[i][j]){
                    res = true;
                }
            }
        }
        return res;
    }*/

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        //从右上角遍历
        int rowNum = matrix.length, columnNum = matrix[0].length;
        int row = 0, column = columnNum -1;
        while(row < rowNum && column >= 0){
            int num = matrix[row][column];
            if(num == target){
                return true;
            }else if(num > target){
                column --;
            }else {
                row ++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       //int[][] nums = new int[][]{{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
       //findNumberIn2DArray(nums, 5);
        //int[][] nums = new int[][]{{-5}};
        //findNumberIn2DArray(nums, -10);

        int[][] nums = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        findNumberIn2DArray(nums, 19);

    }
}
