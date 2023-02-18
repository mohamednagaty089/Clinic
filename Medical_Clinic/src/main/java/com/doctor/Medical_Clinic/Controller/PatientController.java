package com.doctor.Medical_Clinic.Controller;


import com.doctor.Medical_Clinic.DTO.PatientDto;

import com.doctor.Medical_Clinic.Entity.Patient;

import com.doctor.Medical_Clinic.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @GetMapping    @RequestMapping("/count")
    public long count(){
        return patientService.count();
    }

//    @GetMapping
//    public List<Patient> findAll(){
//        return patientService.fi;
//    }

    @GetMapping("/{Name}")
    public PatientDto findByName(@PathVariable String Name){
        Patient patient=patientService.findByName(Name);
        PatientDto patientDto=new PatientDto();
        patientDto.setName(patient.getName());
        patientDto.setAddress(patient.getAddress());
        return patientDto;
    }
    @PostMapping("")//////////////
    public Patient insert(@RequestBody @Valid Patient patient)
    {

        return patientService.insert(patient);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Valid Integer id){
        patientService.delete(id);
    }

}
