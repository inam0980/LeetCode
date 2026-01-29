class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int max=mat[0][0];

        int p=0,k=0;
       
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                    p=i;
                    k=j;

                }

            }
        }
        int arr[]={p,k};

        return arr;
        
    }
}