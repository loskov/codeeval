package easy.SumOfDigits

import spock.lang.Specification
import spock.lang.Unroll

class SumOfDigitsTest extends Specification {
    @Unroll
    def "sum of digits of #input should be #expected"() {
        expect:
        SumOfDigits.sumOfDigits(input) == expected
        where:
        input   || expected
        "12"    || 3
        "61236" || 18
    }
}
