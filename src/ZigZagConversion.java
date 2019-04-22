/**
 * @author xueliang
 * @since 2019-04-22 00:33
 */
public class ZigZagConversion {

    private char[] chars;

    public static void main(String[] args) {
        String s = "AB";
        int numRows = 1;
        String result = new ZigZagConversion().convert(s, numRows);
        System.out.println(result);
    }

    public String convert(String s, int numRows) {
        int len = s.length(), copyLength = numRows * 2 - 2;
        copyLength = Math.max(copyLength, numRows);
        int copyCount = len / copyLength;
        int mod = len % copyLength;
        int _copyCount = mod == 0 ? copyCount : copyCount + 1;
        StringBuilder sb = new StringBuilder();
        chars = s.toCharArray();
        // 行
        for (int i = 0, ilen = Math.min(len, numRows); i < ilen; i++) {
            // 个
            for (int j = 0, jlen = _copyCount; j < jlen; j++) {
                if (i == 0) {
                    sb.append(chatAt(copyLength * j));
                    continue;
                }
                if (i == numRows - 1) {
                    sb.append(chatAt(copyLength * j + i));
                    continue;
                }
                sb.append(chatAt(copyLength * j + i)).append(chatAt(copyLength * (j + 1) - i));
            }
        }
        return sb.toString();
    }

    private String chatAt(int index) {
        if (index >= chars.length) {
            return "";
        }
        return String.valueOf(chars[index]);
    }
}
