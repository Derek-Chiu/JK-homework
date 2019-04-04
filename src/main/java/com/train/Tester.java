package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        TicketVendorJava ticket = new TicketVendorJava(1000, 0.9f);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter -1 to finish");

        System.out.print("Please enter number of tickets: ");
        int totalTicketQty = scanner.nextInt();

        while(totalTicketQty != -1) {
            ticket.setTicketQty(totalTicketQty);

            System.out.print("How many round-trip tickets: ");
            ticket.setRoundTripQty(scanner.nextInt());

            ticket.printInfo();

            System.out.print("Please enter number of tickets: ");
            totalTicketQty = scanner.nextInt();
        }

        System.out.println("Thank you for traveling with Java&Kotlin");
    }
}
