class Solution {
    public int minimumChairs(String s) {
        char[]arr=s.toCharArray();
        int occ=0;
        int ava=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='E'){
             occ++;
             
            }
           
            else if(arr[i]=='L'){
           occ--;}
        
        if(occ>ava){
            ava=occ;
        }}
        return ava;
    }
}