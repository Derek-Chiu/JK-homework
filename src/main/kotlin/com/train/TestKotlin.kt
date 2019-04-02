package com.train

import java.util.*

fun main() {
    val ticket = TicketVendorKotlin(1000, 0.9f)
    val scanner = Scanner(System.`in`)

    print("Please enter number of tickets: ")
    ticket.setTicketQty(scanner.nextInt())

    print("How many round-trip tickets: ")
    ticket.setRoundTicketQty(scanner.nextInt())

    ticket.printInfo()
}

class TicketVendorKotlin(private val oneWayPrice: Int, private val roundTripDiscount: Float) {

    private var ticketQty = 0
    private var roundTicketQty = 0

    fun setTicketQty(qty: Int) {
        this.ticketQty = qty
    }

    fun setRoundTicketQty(qty: Int) {
        this.roundTicketQty = qty
    }

    private fun roundTripTicketPrice(): Int {
        return (oneWayPrice * 2 * roundTripDiscount).toInt()
    }

    private fun priceInTotal(): Int {
        val oneWayQty = ticketQty - roundTicketQty
        val oneWayAmount = oneWayPrice * oneWayQty
        val roundTripAmount = roundTripTicketPrice() * roundTicketQty
        return oneWayAmount + roundTripAmount
    }

    fun printInfo() {
        print(
            "Total Tickets: " + ticketQty + "\n" +
            "Round-trip:" + roundTicketQty + "\n" +
            "Total: " + priceInTotal()
        )
    }
}