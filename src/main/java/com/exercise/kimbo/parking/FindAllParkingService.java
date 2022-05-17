package com.exercise.kimbo.parking;

import com.exercise.kimbo.parking.entity.AddressDto;
import com.exercise.kimbo.parking.entity.Parking;
import com.exercise.kimbo.parking.entity.ParkingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FindAllParkingService {
    ParkingRepository REPOSITORY;

    @Autowired
    ParkingRepository setRepository(ParkingRepository REPOSITORY) {
        this.REPOSITORY = REPOSITORY;
        return REPOSITORY;
    }

    public List<Parking> get_latest_parkings() {
        final List<Parking> all = REPOSITORY.findAll();

        List parkings = new ArrayList();

        for (int i = 1; i < all.size(); i++) {
            Parking parking = all.get(i);
            parkings.add(new ParkingDto(parking.getId(), parking.getName(), parking.getLat(), parking.getLng(), new AddressDto(parking.getAddress().getCountry(), parking.getAddress().getStreet(), parking.getAddress().getPostalCode())));
        }
        return parkings;
    }
}
