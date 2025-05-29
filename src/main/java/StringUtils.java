public class StringUtils {
    public static boolean isPalindrome(String input) {
        String clean = input.toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
