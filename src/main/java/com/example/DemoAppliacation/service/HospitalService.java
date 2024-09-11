package com.example.DemoAppliacation.service;

import com.example.DemoAppliacation.model.HospitalModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class HospitalService {
    private final List<HospitalModel> hospitals = new ArrayList<>();

    public HospitalService() {
        // Initialize with some dummy data
        hospitals.add(new HospitalModel(1L, "City Hospital", "New York"));
        hospitals.add(new HospitalModel(2L, "County Hospital", "Los Angeles"));
    }
//
    public List<HospitalModel> getAllHospitals() {
        return hospitals.stream().sorted(Comparator.comparingLong(HospitalModel::getId)).toList();
    }

    public HospitalModel getHospitalById(Long id) {
        return hospitals.stream().filter(h -> h.getId().equals(id)).findFirst().orElse(null);
    }

    public void addHospital(HospitalModel hospital) {
        hospitals.add(hospital);
    }

    public void updateHospital(Long id, HospitalModel hospital) {
        HospitalModel existingHospital = getHospitalById(id);
        if (existingHospital != null) {
            existingHospital.setName(hospital.getName());
            existingHospital.setLocation(hospital.getLocation());
        }
    }

    public void deleteHospital(Long id) {
        hospitals.removeIf(hospitalModel -> hospitalModel.getId().equals(id));
    }
        }


