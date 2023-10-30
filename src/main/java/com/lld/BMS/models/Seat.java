package com.lld.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seat")
public class Seat extends BaseModel {

    private int rowVal;
    private int colVal;
    private String seatNumber;


    @ManyToOne
//    @JoinColumn(name = "seat_type_id")
    private SeatType seatType;

    @ManyToOne
//    @JoinColumn(name = "screen_id")
    private Screen screen;

}

// 100 seats
// VIP, Gold and Silver
// VIP seatType -> 20 seats || Seat to SeatType -> ManyToOne
// GOLD -> 50
// SILVER -> 30