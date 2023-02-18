package com.doctor.Medical_Clinic.Entity;

import com.doctor.Medical_Clinic.Base.BaseEntity;
import com.doctor.Medical_Clinic.Validator.Telephone;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="patient")
public class Patient extends BaseEntity<Integer> {


    @Column(name = "name")
    private String name;
    @Column(name = "telephone")
//    @NotNull
    @Telephone
    private  String telephone;

//    @NotNull
    private String address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_fk")
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient(String name, String telephone, String address) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Patient() {
    }
}
