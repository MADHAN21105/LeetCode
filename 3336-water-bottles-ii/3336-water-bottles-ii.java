class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=numBottles;
        int fullBottle=1;
        int total=0;
        while( empty>=numExchange){
           empty=(empty- numExchange)+fullBottle;
           numExchange++;
           total++;

        }
        return total+numBottles;
        
    }
}