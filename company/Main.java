package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Ticket regularTicket = new RegularTicket("1234", "Bangalore", "Sikkim", "DepartureDate", "DepartureTime", "ArrivalDate", "ArrivalTime", "B004", 2000, false, null, null, "Breakfast");

        Ticket touristTicket = new TouristTicket("9999", "Mumbai", "Bali", "DepartureDate", "DepartureTime", "ArrivalDate", "ArrivalTime", "D41", 750, true, null, null, "Sheraton Grand", new String[]{"Gold Finch", "Shangri-la Hotel"});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

        (Ticket ticket){
            System.out.println(ticket.getPnr());
        }

    }

    private static void printTicketDetails(Ticket regularTicket) {
        this.Ticket = Ticket;
    }
}
