package com.exercise.kimbo.parking.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

@Getter
@AllArgsConstructor
public class ParkingDto {

    private Long id;
    private String name;
    private double lat;
    private double lng;
    private AddressDto address;
}

