package easy.BitPositions;

/**
 * https://www.codeeval.com/open_challenges/19/
 */
public class BitPositions {
    public static boolean isBitPositionsEqual(String input) {
        String[] split = input.split(",");
        Integer number = Integer.valueOf(split[0]);
        Integer bytePos1 = Integer.valueOf(split[1]);
        Integer bytePos2 = Integer.valueOf(split[2]);

        String binary = Integer.toBinaryString(number);
        int length = binary.length();
        return binary.charAt(length - bytePos1) == binary.charAt(length - bytePos2);
    }
}
