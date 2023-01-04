package com.example.hackerrank.done

/**
-- Problem --
HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3,
round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade

Example:
grade = 84  round to 85 (85 - 84 is less than 3)
grade = 29 do not round (result is less than 40)
grade = 57 do not round (60 - 57 is 3 or higher)
Given the initial value of grade for each of Sam's n students, write code
to automate the rounding process.

 */

fun main() {
   var grades = arrayOf(32, 55, 58, 38, 37)
   println(gradingStudents(grades))
}

fun gradingStudents(lista: Array<Int>): Int {
   var nuevaNota = 0
   lista.forEachIndexed() { v, x ->
      if (x > 37) {

         if ((x + 1) % 5 == 0) {
            nuevaNota = x + 1

         } else if ((x + 2) % 5 == 0) {
            nuevaNota = x + 2

         } else {
            nuevaNota = x
         }

      } else {
         nuevaNota = x
      }
      println("Estudiante ${v + 1}, nota Inicial: $x, nota final: $nuevaNota")

   }

   return 0
}
