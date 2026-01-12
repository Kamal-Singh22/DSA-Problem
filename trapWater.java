// class Solution {

//     // Function to calculate trapped rain water
//     public int trap(int[] height) {
//         int n = height.length;
//         if (n == 0) return 0;
//         int[] leftMax = new int[n];
//         int[] rightMax = new int[n];
//         // Build leftMax array
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(leftMax[i - 1], height[i]);
//         }
//         // Build rightMax array
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(rightMax[i + 1], height[i]);
//         }
//         // Calculate trapped water
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             int waterAtI = Math.min(leftMax[i], rightMax[i]) - height[i];
//             sum += waterAtI;
//         }
//         return sum;
//     }
//     // Test
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] height = {4, 2, 0, 3, 2, 5};
//         System.out.println(sol.trap(height)); // Output: 9
//     }
// }
//Optimal Two pointer Approach TC O(N):
class trapWater {

    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    // Test
    public static void main(String[] args) {
        trapWater sol = new trapWater();
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(sol.trap(height));
    }
}
