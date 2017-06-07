package easy.MultiplesOfNumber;

/**
 * https://www.codeeval.com/open_challenges/18/
 */
public class MultiplesOfNumber {
    public static Integer getBiggestMultiple(String input) {
        String[] initial = input.split(",");
        Integer x = Integer.valueOf(initial[0]);
        Integer n = Integer.valueOf(initial[1]);
        Integer res = 0;
        Integer i = 2;
        while(res < x) {
            res = n * i;
            i++;
        }
        return res;
    }
}
