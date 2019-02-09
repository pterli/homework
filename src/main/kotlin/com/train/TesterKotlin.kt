package com.train

import java.util.*
const val TicketPrice = 1000

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var totalTickets = 0
    while (totalTickets != -1) {
        print("Please enter number of tickets: ")
        var totalTickets = scanner.nextInt()
        if (totalTickets != -1){
            print("How many round-trip tickets:")
            var roundTickets = scanner.nextInt()
            val result = TicketCalculator(totalTickets, roundTickets)
            result.calculation()
        }else{
            break
        }
    }
}

class TicketCalculator(var totalTickets: Int, var roundTickets: Int){
    fun calculation(){
        println("Total Tickets: $totalTickets")
        println("Round-trip: $roundTickets")
        println("Total: " + ( (totalTickets - roundTickets) * TicketPrice +roundTickets * TicketPrice * 2 * 0.9))
    }
}