import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        if (strs.length == 1) {
            return strs[0];
        }
        String s1 = strs[0]; 
        String s2 = strs[strs.length - 1]; 
        StringBuilder sub = new StringBuilder();
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sub.append(s1.charAt(i));
            } else {
                break;
            }
        }

        return sub.toString();
    }
}