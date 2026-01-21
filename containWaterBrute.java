//Containing most water:
//Brute Force

class containWaterBrute {

    public static int Max(int height[]) {
        int n = height.length;
        int maxwater = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                maxwater = Math.max(maxwater, h * w);
            }
        }
        return maxwater;
    }

    public static void main(String[] asdf) {
        int height[] = {1, 2, 0, 4, 1, 9, 2};
        System.out.println(Max(height));
    }
}
