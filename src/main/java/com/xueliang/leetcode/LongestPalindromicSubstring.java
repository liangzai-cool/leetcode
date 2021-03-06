package com.xueliang.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xueliang
 * @since 2019-04-21 18:31
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "ukxidnpsdfwieixhjnannbmtppviyppjgbsludrzdleeiydzawnfmiiztsjqqqnthwinsqnrhfjxtklvbozkaeetmblqbxbugxycrlzizthtuwxlmgfjokhqjyukrftvfwikxlptydybmmzdhworzlaeztwsjyqnshggxdsjrzazphugckgykzhqkdrleaueuajjdpgagwtueoyybzanrvrgevolwssvqimgzpkxehnunycmlnetfaflhusauopyizbcpntywntadciopanyjoamoyexaxulzrktneytynmheigspgyhkelxgwplizyszcwdixzgxzgxiawstbnpjezxinyowmqsysazgwxpthloegxvezsxcvorzquzdtfcvckjpewowazuaynfpxsxrihsfswrmuvluwbdazmcealapulnahgdxxycizeqelesvshkgpavihywwlhdfopmmbwegibxhluantulnccqieyrbjjqtlgkpfezpxmlwpyohdyftzgbeoioquxpnrwrgzlhtlgyfwxtqcgkzcuuwagmlvgiwrhnredtulxudrmepbunyamssrfwyvgabbcfzzjayccvvwxzbfgeglqmuogqmhkjebehtwnmxotjwjszvrvpfpafwomlyqsgnysydfdlbbltlwugtapwgfnsiqxcnmdlrxoodkhaaaiioqglgeyuxqefdxbqbgbltrxcnihfwnzevvtkkvtejtecqyhqwjnnwfrzptzhdnmvsjnnsnixovnotugpzuymkjplctzqbfkdbeinvtgdpcbvzrmxdqthgorpaimpsaenmnyuyoqjqqrtcwiejutafyqmfauufwripmpcoknzyphratopyuadgsfrsrqkfwkdlvuzyepsiolpxkbijqw";
        String result = new LongestPalindromicSubstring().longestPalindrome(s);
        System.out.println(result);
    }

    public String longestPalindrome(String s) {
        String maxSubstring = "";
        for (int endIndex = 1, len = s.length(); endIndex <= len; endIndex++) {
            for (int beginIndex = 0; beginIndex < endIndex - maxSubstring.length(); beginIndex++) {
                String subString = s.substring(beginIndex, endIndex);
                if (isPalindromic(subString) && subString.length() > maxSubstring.length()) {
                    maxSubstring = subString;
                }
            }
        }
        return maxSubstring;
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
