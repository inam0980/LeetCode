class Solution {
    public List<List<Integer>> generate(int numRows) {

        int n=numRows;

        List<List<Integer>> lst1=new ArrayList<>();

        for(int i=0;i<n;i++){
            ArrayList<Integer> lst2= new ArrayList<>();
            lst2.add(1);
            for(int j=1;j<i;j++){
                lst2.add(lst1.get(i-1).get(j-1) + lst1.get(i-1).get(j));
            }
            if(i>0){
                lst2.add(1);
            }
            lst1.add(lst2);
        }

        return lst1;
        
    }
}