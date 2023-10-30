package com.lld.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User extends BaseModel {

    private String name;
    private String email;
    private String password;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<Ticket> tickets;
}