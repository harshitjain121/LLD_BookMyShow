package com.lld.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seat_type")
public class SeatType extends BaseModel {

    private String name;
}