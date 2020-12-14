package com.xueliang.leetcode;

/**
 * @author xueliang
 * @since 2019-04-22 14:19
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
        System.out.println(palindromeNumber.isPalindrome(-121));
        System.out.println(palindromeNumber.isPalindrome(10));
    }

    public boolean isPalindrome(int x) {
        return isPalindromic(String.valueOf(x));
    }

    public boolean isPalindromic(String substring) {
        int len = substring.length();
        int left = len / 2;
        for (int i = 0, j = len - 1; i <= left; i++, j--) {
            if (substring.charAt(i) != substring.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
