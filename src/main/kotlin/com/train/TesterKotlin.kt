package com.train

import java.util.*
const val TicketPrice = 1000

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var totaltickets = scanner.nextInt()
    print("How many round-trip tickets:")
    var roundtickets = scanner.nextInt()
    val result = TicketCalculator(totaltickets, roundtickets)
    result.calculation()
}

class TicketCalculator(var totaltickets: Int, var roundtickets: Int){
    fun calculation(){
        println("Total Tickets: $totaltickets")
        println("Round-trip: $roundtickets")
        println("Total: " + ( (totaltickets - roundtickets) * TicketPrice +roundtickets * TicketPrice * 2 * 0.9))
    }
}