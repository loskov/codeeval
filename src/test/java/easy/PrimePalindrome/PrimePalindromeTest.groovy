package easy.PrimePalindrome

import spock.lang.Specification

class PrimePalindromeTest extends Specification {
    def "biggest palindrome < 1000 is 929"() {
        expect:
        assert PrimePalindrome.getBiggestPalindromeLessThan1000() == Integer.valueOf(929)
    }

    def "check if Number is a palindrome"() {
        expect:
        PrimePalindrome.isPalindrome(n) == expected
        where:
        n   || expected
        121 || true
        122 || false
    }
}
