/**
 * @author xueliang
 * @since 2019-04-22 12:40
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        String[] array = s.split("");
        StringBuilder l1 = new StringBuilder();
        StringBuilder l2 = new StringBuilder();
        for (String string : array) {
            if ("".equals(string)) {
                continue;
            }
            int index = l2.indexOf(string);
            if (index >= 0) {
                if (l2.length() > l1.length()) {
                    l1 = l2;
                }
                l2 = new StringBuilder(l2.substring(index + 1)).append(string);
            } else {
                l2.append(string);
            }
        }
        return Math.max(l1.length(), l2.length());
    }
}
