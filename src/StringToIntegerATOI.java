import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xueliang
 * @since 2019-04-22 13:20
 */
public class StringToIntegerATOI {

    public static void main(String[] args) {
        StringToIntegerATOI stringToIntegerATOI = new StringToIntegerATOI();
        System.out.println(stringToIntegerATOI.myAtoi("   -42"));;
        System.out.println(stringToIntegerATOI.myAtoi("42"));;
        System.out.println(stringToIntegerATOI.myAtoi("4193 with words"));;
        System.out.println(stringToIntegerATOI.myAtoi("words and 987"));;
        System.out.println(stringToIntegerATOI.myAtoi("-91283472332"));;
        System.out.println(stringToIntegerATOI.myAtoi("+1"));;
    }

    public int myAtoi(String str) {
        String regex = "^\\s*((\\+|\\-)?\\d+){1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String g = matcher.group(1);
            try {
                return Integer.parseInt(g);
            } catch (NumberFormatException e) {
                return g.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;
    }
}
