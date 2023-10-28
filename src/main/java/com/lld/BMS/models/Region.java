package com.lld.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Region extends BaseModel {

    private String name;

    //    1 : M
    //    1  :  1
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "region")
    private List<Theatre> theatre;
}
