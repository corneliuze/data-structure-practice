package sliding_window

import kotlin.math.max

object BuyAndSellStock {

    @JvmStatic
    fun main(args: Array<String>) {
        print(maxProfit(intArrayOf(0)))
    }

    private fun maxProfit(prices: IntArray): Int {

        var minimumPrice = prices.first()
        var maximumProfit = 0

        for (currentIndex in prices.indices) {
            if (currentIndex == 0) continue
            val currentPrice = prices[currentIndex]
            if(currentPrice < minimumPrice) {
                minimumPrice = currentPrice
            } else {
               maximumProfit = max(currentPrice - minimumPrice, maximumProfit)
            }
        }
        return maximumProfit
    }
}