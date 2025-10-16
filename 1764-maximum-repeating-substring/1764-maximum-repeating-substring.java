class Solution {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb = new StringBuilder();
           int count = 0;
        while (true) {
            sb.append(word);
            if (sequence.contains(sb.toString())) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    
    }
