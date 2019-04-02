package com.train;

public class TicketVendorJava {

    private int oneWayPrice;
    private float roundTripDiscount;
    private int ticketQty;
    private int roundTicketQty;

    public TicketVendorJava(int price, float roundTripDiscount) {
        this.oneWayPrice = price;
        this.roundTripDiscount = roundTripDiscount;
    }

    public void setTicketQty(int qty) {
        this.ticketQty = qty;
    }

    public void setRoundTripQty(int qty) {
        this.roundTicketQty = qty;
    }

    private int roundTripPrice() {
        return (int)(oneWayPrice * 2 * roundTripDiscount);
    }

    private int priceInTotal() {
        int oneWayQty = ticketQty - roundTicketQty;
        int oneWayAmount = oneWayPrice * oneWayQty;
        int roundTripAmount = roundTripPrice() * roundTicketQty;
        return oneWayAmount + roundTripAmount;
    }

    public void printInfo() {
        System.out.print(
                "Total Tickets: " + ticketQty + "\n" +
                "Round-trip:" + roundTicketQty + "\n" +
                "Total: " + priceInTotal());
    }

}
