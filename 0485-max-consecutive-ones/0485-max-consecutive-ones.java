class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int num : nums) {
            count = (num == 1) ? count + 1 : 0;
            max = Math.max(max, count);
        }
        return max;
    }
}


// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int max=0;
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==1){
//                 count++;
//                 if(max<count){
//                     max=count;
//                 }
//             }
//             else if(nums[i]==0){
//                 count=0;
//             }
//         }
//         return max;
//     }
// }