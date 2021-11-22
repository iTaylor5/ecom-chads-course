package com.example.ecommerceprojectsite.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="state")
@Data
@Getter
@Setter
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    // Many states belong to on country
    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

}
