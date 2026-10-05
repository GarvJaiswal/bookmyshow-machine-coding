package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;
    private int rowNumber;
    private int colNumber;

    // Seat - SeatType : M:1
    @ManyToOne
    private SeatType seatType;
}

// Seat --- SeatType =>  M:1
