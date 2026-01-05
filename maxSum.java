
class maxSum {

    public static int maxSub(int arr[], int k) {
        if (arr == null || arr.length < 0 || arr.length < k || k <= 0) {
            return -1;
        }
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - k; i++) {
            int currsum = 0;
            for (int j = i; j < i + k; j++) {
                currsum += arr[j];
            }
            // if(currsum>maxsum){
            //     maxsum=currsum;
            // }
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }

    public static void main(String[] asdf) {
        int arr[] = {11, 22, 33, 0, 34, 6, 60, 1, 22};
        int k = 3;
        int res = maxSub(arr, k);
        System.out.print(k + " " + res);
    }
}
