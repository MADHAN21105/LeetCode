class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int p=0;
        int result[]=new int[n+m];
        for(int i=0;i<n;i++){
            result[p++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            result[p++]=nums2[i];       
    }
   Arrays.sort(result);

    double med=0;

    if(result.length%2==0){
        med=((result[result.length/2])+(result[result.length/2-1]))/2.0;
    }
    else{
         med=(result[result.length/2]);
    }
    return med;
}}