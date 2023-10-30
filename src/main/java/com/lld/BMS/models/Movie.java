package com.lld.BMS.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie extends BaseModel {

    private String name;
    private String description;
    private String posterLink;

//    @Enumerated(EnumType.ORDINAL)
//    private Language language;

    /*
        1  : M
        M   :  1
        @ManyToMany
        private List<Actor> actors;
    */
}