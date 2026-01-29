class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int beg=0;
        int end=numbers.length-1;

        int b=0,n=0;

        while(beg<end){
            if(numbers[beg]+numbers[end]==target){
                b=beg;
                n=end;
                return new int []{b+1,n+1};

            }
            else if(numbers[beg]+numbers[end]>target){
                end--;
            }
            else{
                beg++;
            }

        }
        return new int[]{};
    }
        
    
}