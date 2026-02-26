// Last updated: 2/26/2026, 9:56:39 AM
class Solution {
    public int hammingWeight(int n) {
        int setbit=0;
        while(n>0){
            int bit=n&1;
            if(bit==1){
                setbit++;
            }
            n=n>>1;
        }
        return setbit;
    }
}