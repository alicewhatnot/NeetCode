
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            int pos = t.indexOf(s.charAt(i));
            if (pos == -1) {
                return false;
            } else {
                t = t.substring(0,pos)+'0'+t.substring(pos+1);
            }
        }
        return true;


    }
}
