package com.typhoid.sannimichael.patient.service;

import java.util.List;

import com.typhoid.sannimichael.patient.dto.PatientCreationRequestDto;
import com.typhoid.sannimichael.patient.entity.Patient;
import com.typhoid.sannimichael.patient.repository.PatientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;




import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PatientService {

	private final PatientRepository patientRepository;

	public ResponseEntity<?> createEmployee(final PatientCreationRequestDto patientCreationRequestDto) {

		if (patientRepository.existsByEmailId(patientCreationRequestDto.getEmailId()))
			return ResponseEntity.badRequest().body("Duplicate Email-id provided");

		final var employee = new Patient();
		employee.setInfected(patientCreationRequestDto.isActive());
		employee.setDateOfBirth(patientCreationRequestDto.getDateOfBirth());
		employee.setEmailId(patientCreationRequestDto.getEmailId());
		employee.setFirstName(patientCreationRequestDto.getFirstName());
		employee.setJobTitle(patientCreationRequestDto.getJobTitle());
		employee.setJoiningDate(patientCreationRequestDto.getJoiningDate());
		employee.setLastName(patientCreationRequestDto.getLastName());
		employee.setMiddleName(patientCreationRequestDto.getMiddleName());

		patientRepository.save(employee);
		return ResponseEntity.ok("Employee Saved Successfully");
	}

	public List<Patient> getAllEmployees() {
		return patientRepository.findAll();
	}

}
