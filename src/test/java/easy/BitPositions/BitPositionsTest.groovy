package easy.BitPositions

import spock.lang.Specification

class BitPositionsTest extends Specification {
    def "test isBitPositionsEqual"() {
        expect:
        BitPositions.isBitPositionsEqual(input) == expected
        where:
        input || expected
        "86,2,3" || true
        "125,1,2" || false
    }
}
