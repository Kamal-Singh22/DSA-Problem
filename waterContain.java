//Optimal Two Pointer Approach:

class waterContain {

    public static int maxwater(int hight[]) {
        int left = 0;
        int n = hight.length;
        int right = n - 1;
        int maxwater = 0;
        while (left < right) {
            int h = Math.min(hight[left], hight[right]);
            int w = right - left;
            maxwater = Math.max(maxwater, h * w);

            if (hight[left] < hight[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
    }

    public static void main(String[] asdf) {
        int hight[] = {1, 2, 0, 4, 1, 9, 2};
        System.out.println(maxwater(hight));
    }
}
