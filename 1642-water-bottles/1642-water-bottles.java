class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty= numBottles;
        int total=0;
        int rem=0;
        int qus=0;
        while(empty>=numExchange){
         qus=empty/numExchange;
         rem=empty%numExchange;
         empty=qus+rem;
         total+=qus;

        }
        return total+ numBottles;

        
    }
}