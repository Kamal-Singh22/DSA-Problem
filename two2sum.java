
//Brute force TC O(n): Unsorted arrays:
// import java.util.Arrays;
// class two2sum {
//     public static int[] targetsum(int arr[], int target) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{-1, -1};
//     }
//     public static void main(String[] args) {
//         int arr[] = {2, 7, 9, 12};
//         int target = 16;
//         System.out.println(Arrays.toString(targetsum(arr, target)));
//     }
// }
//Optimal Solution TC: O(n)
// import java.util.*;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             int remaining = target - nums[i];
//             if (map.containsKey(remaining)) {
//                 return new int[] { map.get(remaining), i };
//             }
//             map.put(nums[i], i);
//         }
//         return new int[] {};  // if no pair found
//     }
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] res = sol.twoSum(nums, target);
//         System.out.println(Arrays.toString(res));
//     }
// }
//======If the array is not sorted then we can use two pointer approach:
import java.util.Arrays;

class two2sum {

    public static int[] targetSum(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[]{left, right};
            } else if (arr[left] + arr[right] > target) {
                right--;
            }
            left++;

        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 11, 20};
        int target = 15;
        System.out.println(Arrays.toString(targetSum(arr, target)));

    }

}
