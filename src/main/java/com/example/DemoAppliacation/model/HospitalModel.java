package com.example.DemoAppliacation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//
public class HospitalModel {
    private Long id;
    private String name;
    private String location;
    
    public HospitalModel(Long id, String name,String location) {
    	this.id=id;
    	this.name=name;
    	this.location=location;
    }
    public void setId(Long id) {
    	this.id=id;
    }
    public Long getId() {
    	return id;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public String getName() {
    	return name;
    }
    public String getLocation(){
    	return location;
    }
    public void setLocation(String location) {
    	this.location=location;
    }
}
