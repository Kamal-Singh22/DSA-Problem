
import java.util.*;

class perimeterTriangle {

    public int largestPerimeter(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        // start from the largest elements
        for (int i = n - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }

        return 0;
    }

    // Test
    public static void main(String[] args) {
        perimeterTriangle sol = new perimeterTriangle();
        int[] nums = {2, 1, 2};
        System.out.println(sol.largestPerimeter(nums)); // Output: 5
    }
}
