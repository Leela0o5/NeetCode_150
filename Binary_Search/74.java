package Binary_Search;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        boolean p = false;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                p = true;
                break;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return p;
    }
}