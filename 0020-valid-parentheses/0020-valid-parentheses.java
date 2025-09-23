class Solution {
    public boolean isValid(String s) {
        String prev;
        do {
            prev = s;
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        } while (!s.equals(prev));

        return s.isEmpty();
    }
}