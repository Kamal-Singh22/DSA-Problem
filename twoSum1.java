// The problem you are solving is called “Two-Sum Pairs That Sum to Zero”, but in interview/DSA terminology the official name is:

// Two Sum – Pair Sum to Zero (Using Two Pointers)
// Find All Pairs With Sum = 0
//  Find Unique Pairs That Sum to Zero
// 2-Sum (Return All Unique Pairs)
import java.util.*;

class Main {

    public static List<List<Integer>> twoSum1(int arr[]) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                result.add(Arrays.asList(arr[left], arr[right]));
                left++;
                right--;

                //Skip Duplicate
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }

                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }

            } else if (sum < 0) {
                left++;

            } else {
                right--;
            }

        }
        return result;
    }

    public static void main(String[] asdf) {
        int arr[] = {1, 2, 3, -1, 2, -1, 3, -1, -3};
        System.out.print(twoSum1(arr));
    }

}
