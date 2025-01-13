package org.example.app.solutions.arrayString.easy
/*
* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.*/

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var buyPrice = prices[0]

        for (day in 1 until prices.size) {
            if (buyPrice > prices[day]) buyPrice = prices[day]
            else if (maxProfit < prices[day] - buyPrice) maxProfit = prices[day] - buyPrice
        }




        return maxProfit
    }
}

/*
* ما از روشی که استفاده کردیم به این صورت است که یک بار حلقه را چک می‌کنیم. حالا فرض‌هایی را در نظر می‌گیریم.
*  ابتدا فرض می‌کنیم که قیمت روز اول را خریداری کردیم و سپس بررسی می‌کنیم:

اگر قیمتی که خریداری کردیم همان فرض اولیه باشد و قیمت روز بعد بزرگ‌تر باشد،
* در این صورت قیمت خرید (“buy price”) را برابر با قیمت آن روز قرار می‌دهیم.

اما اگر بیشینه سود (“max profit”) ما کوچک‌تر از اختلاف بین قیمت آن روز و قیمت خرید ما باشد، باید مقدار بیشینه سود را برابر با همان اختلاف قرار دهیم، چرا که ما به دنبال بیشترین سود (“maximum profit”) هستیم.
*  این شرط را در “else if” اعمال می‌کنیم.

در نهایت، پس از انجام این محاسبات و چک کردن کل حلقه،
*  مقدار بیشینه سود را برمی‌گردانیم (“return max profit”).

*/



















