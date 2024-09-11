package com.example.DemoAppliacation.controller;

import com.example.DemoAppliacation.model.HospitalModel;
import com.example.DemoAppliacation.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @GetMapping
    public List<HospitalModel> getAllHospitals() {
        return hospitalService.getAllHospitals();
    }

    @GetMapping("{id}")
    public ResponseEntity<HospitalModel> getHospitalById(@RequestParam Long id) {
        HospitalModel hospital = hospitalService.getHospitalById(id);
        if (hospital != null) {
            return new ResponseEntity<>(hospital, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<HospitalModel> addHospital(@RequestBody HospitalModel hospital) {
        hospitalService.addHospital(hospital);
        return new ResponseEntity<>(hospital, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HospitalModel> updateHospital(@PathVariable Long id, @RequestBody HospitalModel hospital) {
        hospitalService.updateHospital(id, hospital);
        return new ResponseEntity<>(hospital, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHospital(@PathVariable Long id) {
        hospitalService.deleteHospital(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}





