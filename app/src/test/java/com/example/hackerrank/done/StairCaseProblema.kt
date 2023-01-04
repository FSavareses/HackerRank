package com.example.hackerrank.done
/**
-- Problem --
Staircase detail

Its base and height are both equal to N.
It is drawn using # symbols and spaces.
The last line is not preceded by any spaces.

Example:
This is a staircase of size N = 4:
   #
  ##
 ###
####
 */

fun main() {
   val escalera = 6
   println(crearEscalera(escalera))
}

fun crearEscalera(escalera: Int) {
   var max = escalera
   var txt = ""
   for (x in 1..escalera) {

      for (i in 2..max) {
         print(" ")


      }
      for (z in 1.. (x)) {

         print("#")
      }
      println("")
      max--

   }
}
