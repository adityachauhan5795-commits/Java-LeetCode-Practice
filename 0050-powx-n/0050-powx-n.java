class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long num = n;
        if (num<0) {
            num=-num;
        }
        while (num>0) {
            if (num%2 == 1) {
                ans=ans * x;
            }
            x = x*x;
            num = num / 2;
        }
        if (n<0){
            ans = 1/ans;
        }
        return ans;
    }
}
