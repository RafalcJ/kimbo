package com.exercise.kimbo.parking.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "Parkings")
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LAT")
    private double lat;
    @Column(name = "LNG")
    private double lng;
    @Embedded
    private Address address;

    public Parking(String name, double lat, double lng, Address address) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.address = address;
    }
}
