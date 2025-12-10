
import java.util.Arrays;

class ConcatenateArray {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 2};
        System.out.println(Arrays.toString(getConcatenation(nums)));

        int[] nums2 = {22, 21, 20, 1};
        System.out.println(Arrays.toString(getConcatenation(nums2)));
    }
}
