class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        ArrayList<ArrayList<Integer>> lst= new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            ArrayList<Integer> a= new ArrayList<>();
            for(int j=0;j<matrix[i].length;j++){
                a.add(matrix[i][j]);
            }
            lst.add(a);
        }
        for(int i=0;i<lst.size();i++){
            Collections.sort(lst.get(i));
        }
        for (int i = 0; i < lst.size(); i++) {
            if (Collections.binarySearch(lst.get(i), target)>=0) { 
                return true;
            }
        }
        return false;
      
    }
}