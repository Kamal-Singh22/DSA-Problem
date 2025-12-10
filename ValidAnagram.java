
import java.util.*;

class ValidAnagram {

    public static boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(isValidAnagram("hello", "hollo"));
        System.out.println(isValidAnagram("hollo", "hollo"));
    }

}
