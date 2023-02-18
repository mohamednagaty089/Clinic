package com.doctor.Medical_Clinic.Entity;

import com.doctor.Medical_Clinic.Base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="appointment")
public class Appointment extends BaseEntity<Integer> {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="patient")
    private Patient patient;

    @Column(name="date")
    private Date date;

    @Column(name="cancel")
    private Boolean cancel;

    public Appointment() {

    }

    public Appointment(Patient patient, Date date, Boolean cancel) {
        this.patient = patient;
        this.date = date;
        this.cancel = cancel;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient_fk( Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getCancel() {
        return cancel;
    }

    public void setCancel(Boolean cancel) {
        this.cancel = cancel;
    }
}
