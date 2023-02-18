package com.doctor.Medical_Clinic.Base;

import com.doctor.Medical_Clinic.Entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public class BaseService <baseEntity extends BaseEntity<Id>,Id extends  Number>{

    @Autowired
    private BaseRepository<baseEntity,Id> baseRepository;



    public baseEntity insert(baseEntity baseEntity){
        return baseRepository.save(baseEntity);
    }
    public long count(){
        return baseRepository.count();
    }
    public List<baseEntity> findAll(){
        return baseRepository.findAll();
    }
    public baseEntity findById(Id id){
        return baseRepository.findById(id).get();
    }

     
    
}
