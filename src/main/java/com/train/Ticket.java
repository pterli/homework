package com.train;

public class Ticket {
    int price = 1000;
    int totalTickets;
    int roundTickets;

    public Ticket(int totalTickets, int roundTickets) {
        this.totalTickets = totalTickets;
        this.roundTickets = roundTickets;
    }

    public void calculation(){
        System.out.println("Total Tickets:"+ totalTickets);
        System.out.println("Round-trip:"+ roundTickets);
        System.out.println("Total: "+ ((totalTickets - roundTickets) * price +roundTickets * price * 2 * 0.9));
    }
}
