
//Optimal Solution TC O(N):
// class containWater {
//     public int maxArea(int[] height) {
//         int n = height.length;
//         int i = 0;
//         int j = n - 1;
//         int maxWater = 0;
//         while (i < j) {
//             int width = j - i;
//             int h = Math.min(height[i], height[j]);
//             int area = width * h;
//             maxWater = Math.max(maxWater, area);
//             // Move the pointer with smaller height
//             if (height[i] > height[j]) {
//                 j--;
//             } else {
//                 i++;
//             }
//         }
//         return maxWater;
//     }
//     // Test
//     public static void main(String[] args) {
//         containWater sol = new containWater();
//         int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//         System.out.println(sol.maxArea(height));
//     }
// }
//Brute Force TC  O(N^2):
class containWater {

    public int maxArea(int[] height) {
        int n = height.length;

        int i = 0;
        int j = n - 1;
        int maxWater = 0;

        while (i < j) {
            int width = j - i;
            int h = Math.min(height[i], height[j]);
            int area = width * h;

            maxWater = Math.max(maxWater, area);

            // Move the pointer with smaller height
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxWater;
    }

    // Test
    public static void main(String[] args) {
        containWater sol = new containWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(sol.maxArea(height)); // Output: 49
    }
}
