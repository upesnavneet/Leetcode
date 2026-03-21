class Solution {
    public int reverse(int x) {
        int sum = 0;

        for (; x != 0; x = x / 10) 
        {
            int digit = x % 10;

            if (sum > Integer.MAX_VALUE / 10 || 
               (sum == Integer.MAX_VALUE / 10 && digit > 7)) 
               {
                return 0;
            }

            if (sum < Integer.MIN_VALUE / 10 || 
               (sum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            sum = sum * 10 + digit;
        }

        return sum;
    }
}