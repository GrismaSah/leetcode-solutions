class Solution {
    public boolean isArmstrong(int n) {
        int duplicate = n;
        // count total digits
        int count = String.valueOf(n).length();
        int sum = 0;
        while(n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            // adding digit^count
            sum = sum + (int)Math.pow(lastdigit, count);
        }
        if(sum == duplicate) {
            return true;
        } else {
            return false;
        }
    }
}
