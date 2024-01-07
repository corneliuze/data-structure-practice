package arrays

object KidsWithCandies {
    @JvmStatic
    fun main(args: Array<String>) {
        print(kidsWithCandies(intArrayOf(2,3,5,1,3), 3))
    }

    private fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var maxCandy = 0
        val result : ArrayList<Boolean> = arrayListOf()

        for(candy in candies) {
            if(candy > maxCandy) maxCandy = candy
        }

        for(index in candies.indices) {
            result.add(candies[index] + extraCandies >= maxCandy)
        }
        return result
    }
}