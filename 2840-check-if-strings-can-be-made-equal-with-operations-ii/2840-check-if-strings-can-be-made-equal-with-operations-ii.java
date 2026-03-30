class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] prime = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
            43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
        };

        final long mod = 1000000007L;
        long e1 = 1, o1 = 1, e2 = 1, o2 = 1;

        for (int i = 0; i < s1.length(); i++) {
            if ((i & 1) == 1) {
                o1 = (o1 * prime[s1.charAt(i) - 'a']) % mod;
                o2 = (o2 * prime[s2.charAt(i) - 'a']) % mod;
            } else {
                e1 = (e1 * prime[s1.charAt(i) - 'a']) % mod;
                e2 = (e2 * prime[s2.charAt(i) - 'a']) % mod;
            }
        }

        return e1 == e2 && o1 == o2;
    }
}