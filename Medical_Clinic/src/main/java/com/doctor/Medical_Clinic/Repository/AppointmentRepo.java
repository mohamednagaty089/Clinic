package com.doctor.Medical_Clinic.Repository;

import com.doctor.Medical_Clinic.Base.BaseRepository;
import com.doctor.Medical_Clinic.Entity.Appointment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface AppointmentRepo extends BaseRepository<Appointment,Integer> {


    public Appointment findByDate(Date date);

    @Query("select app from appointment app inner join patient pat on app.patient = pat.id where pat.name=:name")
    public Appointment findByPatientName(String name);

}
