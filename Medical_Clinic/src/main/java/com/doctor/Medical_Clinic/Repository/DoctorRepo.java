package com.doctor.Medical_Clinic.Repository;


import com.doctor.Medical_Clinic.Base.BaseRepository;
import com.doctor.Medical_Clinic.Entity.Doctor;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends BaseRepository<Doctor,Integer> {
   void deleteById(Integer id);
}
