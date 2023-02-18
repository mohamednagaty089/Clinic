package com.doctor.Medical_Clinic.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.MappedSuperclass;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity<Id>,Id extends Number> extends JpaRepository<T,Id> {//T entity
//@Modifying
//@Transactional
//@Query("update #{#entityName} t set t.statusCode=:statusCode where t.id=:id")
//void updateEntity(@Param("id") Id Id,@Param("statusCode") Integer statusCode);

}
