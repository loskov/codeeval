package easy.FirstXPrimes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstXPrimes {

    public static List<Integer> getFirstXPrimes(int x) {
        return IntStream.range(2, 2 + x * x)
                .boxed()
                .filter(n -> isPrime(n))
                .limit(x)
                .collect(Collectors.toList());
    }

    public static Integer getSumOfFirstXPrimes(int x) {
        return getFirstXPrimes(x).stream()
                .reduce(0,(a, b) -> a+b);
    }

    private static boolean isPrime(Integer n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

}
