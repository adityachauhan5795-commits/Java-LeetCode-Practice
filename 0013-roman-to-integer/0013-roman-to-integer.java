class Solution {
    public int romanToInt(String s){
          int ans = 0;
        for (int i = 0;i<s.length();i++) {
            int num = 0;
            if (s.charAt(i)=='I')num=1;
            else if(s.charAt(i)=='V')num = 5;
            else if (s.charAt(i) == 'X') num = 10;
            else if (s.charAt(i) == 'L') num = 50;
            else if (s.charAt(i) == 'C') num = 100;
            else if (s.charAt(i)=='D')num = 500;
            else if (s.charAt(i) == 'M')num = 1000;
            if (i < s.length()-1&&num < getValue(s.charAt(i+1))) {
                ans = ans - num;
            } else {
                ans=ans + num;
            }
        }
        return ans;
    }
    public int getValue(char c) {
        if (c=='I')return 1;
        if (c=='V')return 5;
        if (c =='X')return 10;
        if (c=='L')return 50;
        if (c =='C')return 100;
        if (c=='D')return 500;
        return 1000;
    }
}