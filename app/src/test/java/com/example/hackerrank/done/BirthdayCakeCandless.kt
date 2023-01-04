package com.example.hackerrank.done

/**
-- Problem --
You are in charge of the cake for a child's birthday.
You have decided the cake will have one candle for each year of their total age.
They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

   Example:
   Candles = [4,4,1,3]
   The maximum height candles are 4 units high. There are 2 of them, so return 2
 */

fun main() {
   val candlesCount = arrayOf(4, 1, 2, 4)
   println(birthdayCakeCandles(candlesCount))
}

fun birthdayCakeCandles(lista: Array<Int>): Int {
   var mayor = -99
   var count = 0
   for (x in lista) {
      if (mayor < x) mayor = x
   }

   for (x in lista) {
      if (x == mayor) count++
   }
   //return count
   return count
}