// Last updated: 2/26/2026, 9:56:06 AM
class Solution {
    public int minAddToMakeValid(String s) {
        
        int open = 0;
        int close = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }else if(ch == ')'){
                if(open >0) {
                    open--;
                }else{
                    close++;
                }
            }
        }
        return open + close;
    }
}