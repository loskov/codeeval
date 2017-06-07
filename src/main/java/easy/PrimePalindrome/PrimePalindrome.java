package easy.PrimePalindrome;

import java.util.stream.IntStream;

/**
 * https://www.codeeval.com/open_challenges/3/
 */
public class PrimePalindrome {

    public static Integer getBiggestPalindromeLessThan1000() {
        return IntStream.range(2, 1000)
                .boxed()
                .filter(n -> isPalindrome(n))
                .filter(n -> isPrime(n))
                .max(Integer::compare).get();
    }

    protected static boolean isPalindrome(Integer n) {
        char[] test = n.toString().toCharArray();
        for (int i = 0; i < test.length; i++) {
            if (test[i] == test[test.length-1-i]) {}
            else return false;
        }
        return true;
    }

    @SuppressWarnings("Duplicates")
    protected static boolean isPrime(Integer n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
