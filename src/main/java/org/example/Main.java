package org.example;

import org.example.singleton.TicketMaker;

public class Main {
    public static void main(String[] args) {
        TicketMaker t1 = TicketMaker.getTicketMaker();
        TicketMaker t2 = TicketMaker.getTicketMaker();

        System.out.println(t1.getNextTicketNumber());
        System.out.println(t2.getNextTicketNumber());
    }
}