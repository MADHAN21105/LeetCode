class Solution {
    public int mostWordsFound(String[] sentences) {
int maxcount=0;
        for(int i=0;i<sentences.length;i++){
             String[] words = sentences[i].split(" "); 
            int wordCount = words.length; 
            if(maxcount<wordCount){
                maxcount=wordCount;
            }
        }
    return maxcount;
        
    }
}