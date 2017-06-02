package easy.FirstXPrimes

import spock.lang.Specification
import spock.lang.Unroll

class FirstXPrimesTest extends Specification {
    def "should return a list"() {
        given:
        def howManyPrimes = 1
        when:
        def primes = FirstXPrimes.getFirstXPrimes(howManyPrimes)
        then:
        primes instanceof List
    }

    @Unroll
    def "for #value should be #expect"() {
        given:
        def howManyPrimes = value
        when:
        def primes = FirstXPrimes.getFirstXPrimes(howManyPrimes)
        then:
        assert primes == expect
        where:
        value || expect
        1     || [2]
        2     || [2, 3]
        14    || [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43]
    }

    @Unroll
    def "sum for #value should be #expect"() {
        given:
        def howManyPrimes = value
        when:
        def primes = FirstXPrimes.getSumOfFirstXPrimes(howManyPrimes)
        then:
        assert primes == expect
        where:
        value || expect
        1     || 2
        2     || 5
        5     || 28
    }
}
