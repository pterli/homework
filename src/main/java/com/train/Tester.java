package com.train;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int totalTickets = 0;
        while (totalTickets != -1) {
            System.out.print("Please enter number of tickets: ");
            Scanner scanner = new Scanner(System.in);
            totalTickets = scanner.nextInt();
            if (totalTickets != -1){
                System.out.print("How many round-trip tickets: ");
                int roundTickets = scanner.nextInt();
                Ticket ticket = new Ticket(totalTickets, roundTickets);
                ticket.calculation();
            } else {
                break;
            }

        }
    }
}
