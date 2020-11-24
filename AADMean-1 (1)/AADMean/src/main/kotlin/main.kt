/**
AADMean.kt
CIS 211 001
This program calculates the arithmetic mean of 3 integer
numbers.
Last edited by Pat Doyle 9/17/20
 */

import java.util.Scanner

fun main(args: Array<String>) {
    /** Prompt user to enter 3 integers
    and assign variables to each */

    println("Enter an integer. ")
    val a = readLine() ?:""

    println("Enter an integer. ")
    val b = readLine() ?:""

    println("Enter an integer. ")
    val c = readLine() ?:""

    /** Convert these integers to type Double for more
     accurate mean */
    val doubleA = a.toDouble()
    val doubleB = b.toDouble()
    val doubleC = c.toDouble()

    /** Assign the mean of these values to a variable */
    val mean: Double = (doubleA + doubleB + doubleC) / 3

    /** Output mean */
    println("The mean was $mean ")

    /** Ask the user for another integer and convert
      to double so it can be added to the mean */
    println("Enter another integer. ")
    val d = readLine() ?:""
    val doubleD = d.toDouble()

    /** Add the new value to the mean */
    val final = mean + doubleD

    /** Output the final value */
    println("The mean plus $d is $final .")
}//end main