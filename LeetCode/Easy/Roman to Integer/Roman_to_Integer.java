class Solution {
    public int romanToInt(String s) {
        int Number = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (getValue(s.charAt(i)) < getValue(s.charAt(i + 1))) {
                    Number -= getValue(s.charAt(i));
                    continue;
                }
            }
            Number += getValue(s.charAt(i));
        }
        return Number;
    }
    
    private int getValue(char c) {
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else return 1000;
    }
}