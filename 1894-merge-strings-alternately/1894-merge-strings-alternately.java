
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        int n1 = word1.length(), n2 = word2.length();
        while (i < n1 && j < n2) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        if (i < n1) sb.append(word1.substring(i));
        if (j < n2) sb.append(word2.substring(j));
        return sb.toString();
    }
}
