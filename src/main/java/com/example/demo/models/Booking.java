package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

//Ticket
@Getter
@Setter
public class Booking extends BaseModel {
    private User bookedBy;
    private BookingStatus bookingStatus;
    private List<ShowSeat> showSeats;
    private Date bookingDate;
    private int amount;
    private List<Payment> payments;
}
