//1. one approache is sort the array and then return the last index element which is largest number.

class largest {

    public static int largestNumber(int arr[]) {
        int n = arr.length;
        int largestNum = arr[0];
        for (int i = 0; i < n; i++) {

            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }
        return largestNum;
    }

    public static void main(String[] args) {
        int arr[] = {11, 22, 44, 5, 123};
        System.out.println(largestNumber(arr));
    }
}
