class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        int sum2=0;
        int result=0;
        for(int i=0;i<mat.length;i++){
            sum1+=mat[i][i];
            sum2+=mat[i][mat.length-1-i];
            if(mat.length%2!=0){
            result=sum1+sum2-mat[mat.length/2][mat.length/2];

            }
            else{
                result=sum1+sum2;
            }    
        }
          return result;
    }
}