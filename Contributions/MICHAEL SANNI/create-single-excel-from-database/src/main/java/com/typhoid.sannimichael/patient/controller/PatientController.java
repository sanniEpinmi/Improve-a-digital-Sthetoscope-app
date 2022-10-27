package com.typhoid.sannimichael.patient.controller;

import javax.validation.Valid;

import com.typhoid.sannimichael.patient.constant.ApiConstant;
import com.typhoid.sannimichael.patient.dto.PatientCreationRequestDto;
import com.typhoid.sannimichael.patient.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = ApiConstant.PATIENTS_CONTROLLER_BASE_PATH)
public class PatientController {

	private final PatientService patientService;

	@PostMapping
	@ResponseStatus(value = HttpStatus.OK)
	@Operation(summary = ApiConstant.CREATE_PATIENTS_SUMMARY)
	public ResponseEntity<?> employeeCreationhandler(
			@Valid @RequestBody(required = true) final PatientCreationRequestDto patientCreationRequestDto) {
		return patientService.createEmployee(patientCreationRequestDto);
	}
}
