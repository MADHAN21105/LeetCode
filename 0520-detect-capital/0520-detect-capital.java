class Solution {
    public boolean isSmall(String word){
        for(int i =1; i<word.length();i++){
            if(word.charAt(i)== Character.toUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true ;
    }

    public boolean detectCapitalUse(String word) {
        char m = word.charAt(0);
        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())){
            return true;
        }
        else{
            if((m>= 'A' && m<='Z') && isSmall(word)){
                return true;
            }
        }
        return false;
    }
}