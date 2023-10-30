package com.lld.BMS.models;

import com.lld.BMS.enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "screen")
public class Screen extends BaseModel {

    private String name;
    private Integer capacity;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "screen")
    private List<Seat> seats;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection              // mapping table for screen to features
    private List<Feature> screenFeatures;

    @ManyToOne
//    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

}