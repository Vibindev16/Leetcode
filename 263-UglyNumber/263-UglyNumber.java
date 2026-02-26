// Last updated: 2/26/2026, 9:56:31 AM
class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        int[] primes = {2, 3, 5};
        for(int p: primes) {
            while (n % p == 0) {
                n /= p;
            }
        }
        return n == 1;
    }
}