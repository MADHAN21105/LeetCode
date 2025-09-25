class Solution {
    public int sum(int x){
         int total=0;
         while(x>0){
         int dig=x%10;
             total+=dig;
             x=x/10;
             }
          return total;  
         
    }
    public int addDigits(int num) {
        
    if(num==0){
        return 0;
    }
    while(num>9){
    
    
        num=sum(num);
        if(num<9){
            return num;
        }
         
      
        }
        return num;
       }
}