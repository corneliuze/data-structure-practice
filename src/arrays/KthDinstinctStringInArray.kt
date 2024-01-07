package arrays

object KthDinstinctStringInArray {

    fun kthDistinct(arr: Array<String>, k: Int): String {
        val stringMap = LinkedHashMap<String, Int>()
        for (element in arr) {
            stringMap[element] = stringMap[element]?.plus(1) ?: 1
        }

        val resultList = mutableListOf<String>()
        for ((key, value) in stringMap.entries) {
            if (value == 1) {
                resultList.add(key)
            }
        }


        return if (k <= resultList.size) resultList[k - 1] else ""
    }
}