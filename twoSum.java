
import java.util.Arrays;

class twoSum {

    public static int[] twoSumarr(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    // return new int[]{i, j};//return the index of the array
                    return new int[]{nums[i], nums[j]}; //rerurn the value of the index
                }
            }

        }
        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        int target = 11;
        int[] res = twoSumarr(nums, target);
        System.out.println(Arrays.toString(res));

    }
}
