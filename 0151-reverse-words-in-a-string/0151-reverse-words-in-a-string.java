class Solution {
    public String reverseWords(String s) {
        String []arr=s.trim().split("\\s+");
        int n=arr.length-1;
        int left=0;
        int right=n;
        while(left<right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        } 
        String result =String.join(" ",arr);
         return result;
    }
   
}