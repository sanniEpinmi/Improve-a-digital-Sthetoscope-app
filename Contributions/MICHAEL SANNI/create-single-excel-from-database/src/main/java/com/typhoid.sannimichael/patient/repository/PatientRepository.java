package com.typhoid.sannimichael.patient.repository;

import java.util.UUID;

import com.typhoid.sannimichael.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {

	Boolean existsByEmailId(String emailId);

}
