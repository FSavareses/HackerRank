package com.example.hackerrank

/**
-- Problem --
There is a sequence of words in CamelCase as a string of letters,S, having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given S, determine the number of words in S.

Example:
input = saveChangesInTheEditor:

output = 5

save
Changes
In
The
Editor
 */

fun main() {
    val cadena = "camelCaseProblem"
    println(camelcase(cadena))
}

fun camelcase(cadena: String): Int {
    var palabras = 0
    if (cadena.length > 0) {
        palabras++
        for (x in cadena) {
            if (x.isUpperCase()) palabras++
        }
    }
    return palabras
}

