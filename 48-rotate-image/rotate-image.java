class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int arr[][] = new int[n][n];

        // fill new rotated matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = matrix[n - 1 - j][i];
            }
        }

        // copy back
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
