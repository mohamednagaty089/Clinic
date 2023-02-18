package com.doctor.Medical_Clinic.Controller;

import com.doctor.Medical_Clinic.DTO.DoctorDto;
import com.doctor.Medical_Clinic.Entity.Doctor;
import com.doctor.Medical_Clinic.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;
@Validated
@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    @GetMapping
    @RequestMapping("/count")
    public long count(){
        return doctorService.count();
    }

    @GetMapping
    public List<Doctor> findAll(){
        return doctorService.findAll();
    }
    @GetMapping("/{Id}")
    public DoctorDto findById(@PathVariable @Min(value=10) @Max(value=1000) Integer Id){
         Doctor doctor=doctorService.findById(Id);
         DoctorDto doctorDto=new DoctorDto();
            doctorDto.setName(doctor.getName());
            doctorDto.setAddress(doctor.getAddress());
         return doctorDto;
    }
    @PostMapping("")
    public Doctor insert(@RequestBody @Valid Doctor doctor)
    {

        return doctorService.insert(doctor);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Valid Integer id){
          doctorService.delete(id);
    }

}
