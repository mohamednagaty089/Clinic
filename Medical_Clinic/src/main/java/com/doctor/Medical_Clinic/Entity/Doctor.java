package com.doctor.Medical_Clinic.Entity;


import com.doctor.Medical_Clinic.Base.BaseEntity;
import com.doctor.Medical_Clinic.Validator.Telephone;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="doctor")

public class Doctor extends BaseEntity<Integer> {


    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "telephone")
    @NotNull
    @Telephone
    private  String telephone;

    @Column(name = "address")
    private String Address;



    public Doctor(){};
    public Doctor(String name, String telephone, String address) {
        this.name = name;
        this.telephone = telephone;
        Address = address;
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
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}