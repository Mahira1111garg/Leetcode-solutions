class Solution {
    int ans;

    public int reverse(int x) {
        ans = 0;
        if (x < 0) return -helper(-x);
        return helper(x);
    }
    public int helper(int x) {
        if (x == 0) return ans;
        int digit = x % 10;
        if (ans > Integer.MAX_VALUE / 10) return 0;
        if (ans < Integer.MIN_VALUE / 10) return 0;
        ans = ans * 10 + digit;

        return helper(x / 10);
    }
}