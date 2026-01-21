
class trapWaterBrute {

    public static int maxWater(int arr[]) {
        int n = arr.length;
        int water = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;
            //left max
            for (int l = i; l >= 0; l--) {
                leftMax = Math.max(leftMax, arr[l]);
            }
            //right Max
            for (int r = i; r < n; r++) {
                rightMax = Math.max(rightMax, arr[r]);
            }
            water += Math.min(leftMax, rightMax) - arr[i];
        }
        return water;
    }

    public static void main(String[] asdf) {
        int arr[] = {1, 0, 1, 0, 2, 3, 1, 0, 1, 2};
        System.out.println(maxWater(arr));
    }
}
