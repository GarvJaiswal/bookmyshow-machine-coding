package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    // ShowSeat ---- Show
    @ManyToOne
    private Show show;

    // ShowSeat ---- Seat
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}

// X
// Y

// XY ----- X => M:1
// XY ----- Y => M:1