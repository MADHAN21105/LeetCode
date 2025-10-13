class Solution {
    public String reverseVowels(String s) {
        String str = "";

        for(int i =0 ;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){
                str = c + str;
            }
            
        }

        char[] vow = str.toCharArray();
        int pos =0;
        char[] words = s.toCharArray();

        for(int i =0;i<words.length;i++){
            
            if(words[i]=='A'||words[i]=='a'||words[i]=='E'||words[i]=='e'||words[i]=='I'
            ||words[i]=='i'||words[i]=='O'||words[i]=='o'||words[i]=='U'||words[i]=='u')
            {
             words[i]=vow[pos++];   
            }
        }
        String result = new String(words);
        return result;
    }
}