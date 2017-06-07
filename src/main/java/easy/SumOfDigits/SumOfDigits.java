package easy.SumOfDigits;

import java.util.stream.Stream;

/**
 * https://www.codeeval.com/open_challenges/21/
 */
public class SumOfDigits {
    public static Integer sumOfDigits(String input) {
        return Stream.of(input.split(""))
                .map(Integer::valueOf)
                .reduce(0, (a, b) -> a + b);
    }
}
