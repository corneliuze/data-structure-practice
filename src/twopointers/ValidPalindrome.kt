package twopointers

object ValidPalindrome {

    fun isPalindrome(string: String): Boolean {
        string.filter {
            it.isLetterOrDigit()
        }.run { equals(reversed(), true) }

        val regex = Regex("[^A-Za-z0-9 ]")
        val stringArray = regex.replace(string, "").replace("\\s".toRegex(), "").toLowerCase().toCharArray()

        if (stringArray.isEmpty() || stringArray.size == 1) return true


        println(stringArray)

        var result = false
        var forwardPointer = 0
        var backwardPointer = stringArray.lastIndex

        println("size ${stringArray.size}")
        println(backwardPointer)



        while (forwardPointer < backwardPointer) {
            if (stringArray[forwardPointer] == stringArray[backwardPointer]) {
                forwardPointer += 1
                backwardPointer -= 1
                result = true
            } else {
                result = false
                break
            }
        }
        return result
    }

    /**
     * Another helpful solution
     */
    fun isPalindromes(string: String): Boolean {
        return string.filter {
            it.isLetterOrDigit()
        }.run { equals(reversed(), true) }
    }
}