package com.exercise.kimbo.parking.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateParkingRequest {
    private final String name;
    private final double lat;
    private final double lng;
    private final AddressDto address;
}
