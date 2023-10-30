package com.lld.BMS.models;

import com.lld.BMS.enums.Feature;
import com.lld.BMS.enums.Language;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Showw extends BaseModel{


    @ManyToOne
//    @JoinColumn(name = "movie_id")
    private Movie movie;

    private Date startTime;
    private Date endTime;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "showw")
    private List<ShowSeat> showSeats;

    @Enumerated(EnumType.STRING)
    private Language language;

    @ManyToOne
//    @JoinColumn(name = "screen_id")
    private Screen screen;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection      // mapping table for screen to features
    private List<Feature> showFeatures;
}
