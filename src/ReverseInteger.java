/**
 * @author xueliang
 * @since 2019-04-22 12:47
 */
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(123));
        System.out.println(reverseInteger.reverse(-123));
        System.out.println(reverseInteger.reverse(120));
        System.out.println(reverseInteger.reverse(1534236469));
    }

    public int reverse(int x) {
        String unsigedString = String.valueOf(x).replaceFirst("-", "");
        char[] chars = unsigedString.toCharArray();
        long sum = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            char c = chars[i];
            sum += Integer.parseInt(String.valueOf(c)) * Math.pow(10, i);
            if (sum > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return Long.valueOf(x >= 0 ? sum: 0 - sum).intValue();
    }
}
