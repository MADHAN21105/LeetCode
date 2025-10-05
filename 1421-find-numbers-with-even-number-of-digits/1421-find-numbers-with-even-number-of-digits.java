class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count2=0;
            while(num>0){
                 count2 ++;
              num/=10;
              
            }
            if(count2%2==0){
                count++;
            }
            
        }
        return count;

        
    }
}