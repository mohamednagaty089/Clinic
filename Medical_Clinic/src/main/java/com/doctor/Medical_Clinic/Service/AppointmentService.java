package com.doctor.Medical_Clinic.Service;

import com.doctor.Medical_Clinic.Base.BaseService;
import com.doctor.Medical_Clinic.Entity.Appointment;
import com.doctor.Medical_Clinic.Repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Service
public class AppointmentService extends BaseService<Appointment, Integer> {

    @Autowired
    AppointmentRepo appointmentRepo;

    public Appointment findByDate(Date date){
        return appointmentRepo.findByDate(date);
    }

    public Appointment findByPatientName(String name){
        return appointmentRepo.findByPatientName(name);
    }

}
