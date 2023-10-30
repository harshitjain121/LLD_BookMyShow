package com.lld.BMS.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {

    private String name;
    private String address;

    @ManyToOne
//    @JoinColumn(name = "region_id")
    private Region region;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "theatre")
    private List<Screen> screens;

    // TODO
//    // 1 : m
//    // 1  :  1
//    @OneToMany
//    private List<Show> upcomingShows;

}