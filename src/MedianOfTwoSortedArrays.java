/**
 * @author xueliang
 * @since 2019-04-22 12:41
 */
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] data = new int[nums1.length + nums2.length];
        if (data.length == 0) {
            return 0;
        }
        int index1 = 0, index2 = 0, k = 0, nums1Length = nums1.length, nums2Length = nums2.length;
        int num1, num2;
        while (true) {
            boolean hasCurrent1 = true, hasCurrent2 = true;
            if (index1 < nums1Length) {
                num1 = nums1[index1];
            } else {
                num1 = Integer.MIN_VALUE;
                hasCurrent1 = false;
            }
            if (index2 < nums2Length) {
                num2 = nums2[index2];
            } else {
                num2 = Integer.MIN_VALUE;
                hasCurrent2 = false;
            }
            if (!hasCurrent1 && !hasCurrent2) {
                break;
            }
            if (!hasCurrent1) {
                data[k] = num2;
                index2++;
                k++;
                continue;
            }
            if (!hasCurrent2) {
                data[k] = num1;
                index1++;
                k++;
                continue;
            }
            if (num1 < num2) {
                data[k] = num1;
                index1++;
            } else if (num1 == num2) {
                data[k] = num1;
                k++;
                data[k] = num2;
                index1++;
                index2++;
            } else {
                data[k] = num2;
                index2++;
            }
            k++;
        }
        if (data.length % 2 == 0) {
            int centerRight = data.length / 2;
            int centerLeft = centerRight - 1;
            return (data[centerLeft] + data[centerRight]) / 2.0;
        } else {
            int center = data.length / 2 ;
            return data[center];
        }
    }
}
