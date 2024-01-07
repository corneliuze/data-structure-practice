package sliding_window

import kotlin.math.max

object LongestSubstringWithoutRepeatingChar {
    @JvmStatic
    fun main(args: Array<String>) {
        print(lengthOfLongestSubstring("abcabcbb"))
    }

    private fun lengthOfLongestSubstring(s: String): Int {
       val map = mutableMapOf<Char, Int>()
        var count = 0
        for (index in s.toCharArray().indices){
            val char = s[index]
            if (map.containsKey(char)){
                count = max(index - map[char]!!, count)
            }
            map[char] = index
        }
        return count
    }
}