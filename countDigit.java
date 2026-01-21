
class countDigit {

    public static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1234423232;
        System.out.println(digitCount(n));
    }
}
