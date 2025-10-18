class Solution {
    public int passThePillow(int n, int time) {
         int pass=2*(n-1);
         int time2=time%pass;
         if(time2<n){
            return time2+1;
         }
         return n - (time2 - (n - 1));
    }
}