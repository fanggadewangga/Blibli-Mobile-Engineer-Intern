fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false
    }

    var original = x
    var reversed = 0

    while (original > reversed) {
        val digit = original % 10
        reversed = reversed * 10 + digit
        original /= 10
    }

    return original == reversed || original == reversed / 10
}

fun main() {
    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(10))
}