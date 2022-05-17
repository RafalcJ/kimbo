package com.exercise.kimbo.parking;

import com.exercise.kimbo.parking.entity.Address;
import com.exercise.kimbo.parking.entity.CreateParkingRequest;
import com.exercise.kimbo.parking.entity.Parking;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Log4j2
@RestController
@RequestMapping("/parkings")
class ParkingController {

    ParkingRepository parkingRepository;
    FindAllParkingService findAllParkingService;

    protected ParkingController(ParkingRepository parkingRepository, FindAllParkingService findAllParkingService) {
        this.parkingRepository = parkingRepository;
        this.findAllParkingService = findAllParkingService;
    }

    @PutMapping
    public void createParking(@RequestBody CreateParkingRequest request) {
        Parking parking = new Parking(request.getName(), request.getLat(), request.getLng(), new Address(request.getAddress().getCountry(), request.getAddress().getStreet(), request.getAddress().getPostalCode()));
        final Parking save = parkingRepository.save(parking);
    }

    @PutMapping("/{PARKING_ID}")
    public Parking get_parking(@PathVariable Long PARKING_ID) {
        final Optional<Parking> byId = parkingRepository.findById(PARKING_ID);
        if (byId.isPresent()) {
            return byId.get();
        }
        log.warn("Not found parking");
        return new Parking();
    }

    @GetMapping
    public List<Parking> get_latest_parkings() {
        return findAllParkingService.get_latest_parkings();
    }
}
