package com.doctor.Medical_Clinic.Controller;

import com.doctor.Medical_Clinic.Entity.Appointment;
import com.doctor.Medical_Clinic.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    
    @Autowired
    AppointmentService appointmentService;

    @GetMapping
    @RequestMapping("/count")
    public long count(){
        return appointmentService.count();
    }

//    @GetMapping
//    public List<Patient> findAll(){
//        return appointmentService.fi;
//    }

//    @GetMapping("/{Name}")
//    public PatientDto findByName(@PathVariable String Name){
//        Patient patient=appointmentService.findByName(Name);
//        PatientDto patientDto=new PatientDto();
//        patientDto.setName(patient.getName());
//        patientDto.setAddress(patient.getAddress());
//        return patientDto;
//    }
//    @GetMapping("/{date}")
//    public Appointment findByDate(@RequestParam Date date){
//        return appointmentService.findByDate(date);
//    }
    @GetMapping("/{name}")
    public Appointment findByPatientName(@PathVariable String name ){
        return appointmentService.findByPatientName(name);

    }
    @PostMapping("")//////////////
    public Appointment insert(@RequestBody @Valid Appointment appointment)
    {
        System.out.println(appointment.getPatient().getId() +"      " +appointment.getId()+"      "+appointment.getCancel());
        return appointmentService.insert(appointment);
    }
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable @Valid Integer id){
//        appointmentService.d(id);
//    }
}
