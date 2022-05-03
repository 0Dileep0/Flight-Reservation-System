package com.company;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureDate, String departureTime,
                         String arrivalDate, String arrivalTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureDate, departureTime, arrivalDate, arrivalTime, seatNo, price, cancelled,
                flight, passenger);
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}