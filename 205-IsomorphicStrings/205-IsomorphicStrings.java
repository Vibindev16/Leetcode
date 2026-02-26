// Last updated: 2/26/2026, 9:56:38 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Character> x = new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(x.containsKey(ch1))
            {
                if(x.get(ch1)!=ch2)
                return false;
            }
            else if(x.containsValue(ch2))
            {
                return false;
            }
            x.put(ch1,ch2);
        }
        return true;
        
    }
}