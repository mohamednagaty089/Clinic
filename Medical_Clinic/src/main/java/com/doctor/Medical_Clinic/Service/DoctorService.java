package com.doctor.Medical_Clinic.Service;


import com.doctor.Medical_Clinic.Base.BaseService;
import com.doctor.Medical_Clinic.Entity.Doctor;
import com.doctor.Medical_Clinic.Repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends BaseService<Doctor,Integer> {
    @Autowired
    private DoctorRepo doctorRepo;
    public void delete(Integer Id){
        doctorRepo.deleteById(Id);
    }
}
