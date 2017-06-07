package easy.MultiplesOfNumber

import spock.lang.Specification

class MultiplesOfNumberTest extends Specification {
    def "GetBiggestMultiple"() {
        expect:
        MultiplesOfNumber.getBiggestMultiple(input) == expected
        where:
        input       || expected
        "13,8"      || 16
        "17,16"     || 32
        "1133,256"  || 1280
        "418,16"    || 432
        "2176,1024" || 3072
        "1163,2"    || 1164
    }
}
