import java.util.Scanner;

class Solution {

    public static boolean isPalindrome(int x) {

        int dup = x;
        int revnum = 0;

        if (x < 0) {
            return false;
        }

        while (x != 0) {
            int lastDigit = x % 10;
            revnum = revnum * 10 + lastDigit;
            x = x / 10;
        }
        return dup == revnum;
    }
}