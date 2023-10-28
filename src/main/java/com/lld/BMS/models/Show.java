package com.lld.BMS.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{


    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private Date startTime;
    private Date endTime;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "show")
    private List<ShowSeat> showSeats;

    @Enumerated(EnumType.STRING)
    private Language language;

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection      // mapping table for screen to features ...todo
    private List<Feature> showFeatures;
}
