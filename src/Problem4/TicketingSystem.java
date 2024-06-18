package Problem4;

import java.util.LinkedList;
import java.util.Queue;

class TicketingSystem {
    private Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        this.ticketQueue = new LinkedList<>();
        this.nextId = 1;
    }

    public void addTicket(String description) {
        Ticket newTicket = new Ticket(nextId++, description);
        ticketQueue.add(newTicket);
    }

    public Ticket processTicket() {
        return ticketQueue.poll();
    }

    public Ticket viewNextTicket() {
        return ticketQueue.peek();
    }

    public boolean isQueueEmpty() {
        return ticketQueue.isEmpty();
    }
}