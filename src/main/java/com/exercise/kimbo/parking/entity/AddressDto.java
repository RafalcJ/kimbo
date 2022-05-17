package com.exercise.kimbo.parking.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddressDto {
    private final String country;
    private final String street;
    private final String postalCode;
}

