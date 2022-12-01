object Solution {
    def isPalindrome(x: Int): Boolean = {
        var x_as_string = x.toString
        return x_as_string == x_as_string.reverse
    }
}
