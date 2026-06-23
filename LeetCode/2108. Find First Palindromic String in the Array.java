class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String ch = words[i];
            StringBuilder s = new StringBuilder(ch);
            s = s.reverse();
            String c = s.toString();
            if(ch.equals(c)) return ch; 
        }
        return "";
    }
}