
class Triplet {

    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            // smallest so far
            if (num <= first) {
                first = num;
            } // second smallest so far
            else if (num <= second) {
                second = num;
            } // found third number greater than both
            else {
                return true;
            }
        }

        return false;
    }

    // Test
    public static void main(String[] args) {
        Triplet sol = new Triplet();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(sol.increasingTriplet(nums)); // true
    }
}

//Brute force 
// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     if (nums[i] < nums[j] && nums[j] < nums[k]) {
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;
//     }
//     // Test
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {2, 1, 5, 0, 4, 6};
//         System.out.println(sol.increasingTriplet(nums)); // true
//     }
// }
