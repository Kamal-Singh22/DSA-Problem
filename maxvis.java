// Number of Visible People in a Queue
// Number of Visible People in a Queue
// This is a people visibility / line-of-sight problem that can be solved using a monotonic stack.

class Main {

    static int maxvis(int arr[]) {
        int n = arr.length;
        int maxcount = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;//self
            //left
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    count++;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                } else {
                    break;
                }
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }

    public static void main(String[] asdf) {
        int arr[] = {6, 2, 4, 1, 6, 4, 8, 9, 3};
        int res = maxvis(arr);
        System.out.println(res);
    }
}
