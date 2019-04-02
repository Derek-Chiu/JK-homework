package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        TicketVendorJava ticket = new TicketVendorJava(1000, 0.9f);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        ticket.setTicketQty(scanner.nextInt());

        System.out.print("How many round-trip tickets: ");
        ticket.setRoundTripQty(scanner.nextInt());

        ticket.printInfo();
    }
}
