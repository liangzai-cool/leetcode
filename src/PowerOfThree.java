/**
 * @author xueliang
 * @since 2019-04-22 12:32
 */
public class PowerOfThree {

    public static void main(String[] args) {

    }

    public boolean isPowerOfThree(int n) {
        double result = 0;
        int i = 0;
        while (true) {
            result = Math.pow(3, i++);
            if (result == n) {
                return true;
            } else if (result > n) {
                return false;
            }
        }
    }
}
