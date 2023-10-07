package src.main.java.test;

class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int cur = 0, last = 1, llast = 0;
        for (int i = 2; i < n + 1; i++) {
            cur = last + llast;
            llast = last;
            last = cur;
        }
        return cur;
    }
}