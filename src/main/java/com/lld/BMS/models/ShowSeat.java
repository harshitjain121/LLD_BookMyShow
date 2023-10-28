package com.lld.BMS.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "show_seat_mapping")
public class ShowSeat extends BaseModel {
    //  SS : S
    //   1   1
    //   M    1
    @ManyToOne
    private Show show;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;

    //  SS : S
    //   1   1
    //   m    1
    @ManyToOne
    private Seat seat;

    private double price;

}