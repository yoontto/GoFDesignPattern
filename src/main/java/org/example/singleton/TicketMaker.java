package org.example.singleton;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {

    }

    //synchronized 는 여러개의 스레드에서 비동기로 호출할 떄
    //중복되는 같은 값을 반환하는 문제가 생기는 것을 방지하기 위해 사용
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker getTicketMaker() {
        return ticketMaker;
    }
}
