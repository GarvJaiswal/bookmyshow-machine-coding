package com.example.demo.models;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel {
    //ShowSeatType ------- Show
    @ManyToOne
    private Show show;

    //ShowSeatType ------- Seat
    @ManyToOne
    private SeatType seatType;

    private int price;
}