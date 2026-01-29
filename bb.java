
class bb {

    public static int totalSum(int arr[]) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int max = arr[i];
            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                ans += (max - min);
            }
        }
        return ans;
    }

    public static void main(String[] asdf) {
        int arr[] = {1, 2, 11, 22, 33, -12, -21, 8};
        System.out.print(totalSum(arr));
    }
}
