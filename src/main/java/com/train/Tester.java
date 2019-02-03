package com.train;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int total_tickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int round_tickets = scanner.nextInt();
        Ticket ticket = new Ticket(total_tickets,round_tickets);
        ticket.calculation();
    }
}
