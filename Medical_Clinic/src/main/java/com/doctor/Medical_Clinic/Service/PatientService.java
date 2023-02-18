package com.doctor.Medical_Clinic.Service;


import com.doctor.Medical_Clinic.Base.BaseService;
import com.doctor.Medical_Clinic.Entity.Doctor;
import com.doctor.Medical_Clinic.Entity.Patient;
import com.doctor.Medical_Clinic.Repository.DoctorRepo;
import com.doctor.Medical_Clinic.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends BaseService<Patient,Integer> {
    @Autowired
    private PatientRepo patientRepo;
    public void delete(Integer Id){
        patientRepo.deleteById(Id);
    }
    public Patient findByName(String name){
        return patientRepo.findByName(name);
    }
    public Patient insert(Patient patient){
        return patientRepo.save(patient);
    }
}
