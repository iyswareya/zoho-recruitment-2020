//Solution.java 
/**
 * Check whether two strings are one edit dist apart
 * This is a sample solution not an optimal one.
*/
class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int s_len = s.length(), t_len = t.length();
        boolean change = false;
        if(s_len == t_len + 1){ // delete 
            if(t_len == 0)
                return true;
            for(int i=0,j=0; j<t_len; i++,j++){
                if(s.charAt(i) != t.charAt(j)){
                    if(change)
                        return false;
                    change = true;
                    j--;
                }
            }
        }else if(s_len + 1 == t_len){ // insert
            if(s_len == 0)
                return true;
            for(int i=0,j=0; i<s_len; i++,j++){
                if(s.charAt(i) != t.charAt(j)){
                    if(change)
                        return false;
                    change = true;
                    i--;
                }
            }
        }else if(s_len == t_len && s_len > 0){ // replace 
            for(int i=0,j=0; i<s_len; i++,j++){
                if(s.charAt(i) != t.charAt(j)){
                    if(change)
                        return false;
                    change = true;
                }
            }
            return change;
        }else
            return false;
        return true;
    }
}
