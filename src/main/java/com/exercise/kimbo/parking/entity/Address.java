package com.exercise.kimbo.parking.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "STREET")
    private String street;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
}
