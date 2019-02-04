package com.train;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int totalTickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundTickets = scanner.nextInt();
        Ticket ticket = new Ticket(totalTickets,roundTickets);
        ticket.calculation();
    }
}
