package com.github.erikpedro.parking.controller;

import com.github.erikpedro.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll() {

        var parking = new Parking();
        parking.setColor("Black");
        parking.setModel("Tesla");
        parking.setState("DF");

        return Arrays.asList(parking);
    }


}
