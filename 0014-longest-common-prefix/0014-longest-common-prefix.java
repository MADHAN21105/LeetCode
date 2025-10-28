class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String str = "";
        String word = strs[0];
        String word2 = strs[1];

        for (int i = 0; i < Math.min(word.length(), word2.length()); i++) {
            if (word.charAt(i) == word2.charAt(i)) {
                str += word.charAt(i);
            } else {
                break;
            }
        }

        for (int k = 2; k < strs.length; k++) {
            while (!strs[k].startsWith(str)) {
                str = str.substring(0, str.length() - 1);
                if (str.isEmpty()) return "";
            }
        }

        return str;
    }
}
