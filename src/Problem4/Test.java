package Problem4;

public class Test {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();

        ticketingSystem.addTicket("Issue with logging in");
        ticketingSystem.addTicket("Page not loading");
        ticketingSystem.addTicket("Error message on checkout");

        System.out.println("Next ticket: " + ticketingSystem.viewNextTicket());

        System.out.println("Processing ticket: " + ticketingSystem.processTicket());
        System.out.println("Processing ticket: " + ticketingSystem.processTicket());

        System.out.println("Next ticket: " + ticketingSystem.viewNextTicket());

        System.out.println("Is the ticket queue empty? " + ticketingSystem.isQueueEmpty());

        System.out.println("Processing ticket: " + ticketingSystem.processTicket());

        System.out.println("Is the ticket queue empty? " + ticketingSystem.isQueueEmpty());
    }
}
