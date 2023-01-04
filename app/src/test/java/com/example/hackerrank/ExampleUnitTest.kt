package com.example.hackerrank
/**
-- Problem --


Example:

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
