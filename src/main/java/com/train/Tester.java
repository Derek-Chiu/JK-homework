package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        TicketVendorJava ticket = new TicketVendorJava(1000, 0.9f);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter -1 to finish");

        while(true) {
            System.out.print("Please enter number of tickets: ");
            int totalTicketQty = scanner.nextInt();
            ticket.setTicketQty(totalTicketQty);
            if (totalTicketQty == -1) {
                System.out.print("Thank you for traveling with Java&Kotlin");
                break;
            }

            System.out.print("How many round-trip tickets: ");
            ticket.setRoundTripQty(scanner.nextInt());

            ticket.printInfo();
        }
    }
}
