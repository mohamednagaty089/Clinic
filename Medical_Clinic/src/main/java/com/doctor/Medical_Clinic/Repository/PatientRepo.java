package com.doctor.Medical_Clinic.Repository;


import com.doctor.Medical_Clinic.Base.BaseRepository;
import com.doctor.Medical_Clinic.Entity.Patient;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepo extends BaseRepository<Patient,Integer> {

       void deleteById(Integer id);
       Patient findByName(String name);
}
