package com.typhoid.sannimichael.patient.bootstrap;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import com.typhoid.sannimichael.patient.entity.Patient;
import com.typhoid.sannimichael.patient.repository.PatientRepository;
import org.springframework.stereotype.Component;



import lombok.AllArgsConstructor;
import net.bytebuddy.utility.RandomString;

@Component
@AllArgsConstructor
public class PatientDataPopulationOnBootstrap {

	private final PatientRepository employeeRepository;

	@PostConstruct
	void populatingEmployeeDataInsideInMemoryDatabaseOnStartup() {
		final var employeeList = new ArrayList<Patient>();
		final var random = new Random();
		final var jobTitleList = List.of("Backend Developer", "Frontend Developer", "Database Admin", "Designer",
				"Human Resource Manager", "Project manager", "Android Developer", "Web Developer", "System Engineer");

		for (int i = 1; i < 300; i++) {
			final var patient = new Patient();
			patient.setInfected(random.nextInt(2) == 0 ? true : false);
			patient.setDateOfBirth(LocalDate.of(random.ints(1, 1950, 2001).sum(), random.ints(1, 1, 13).sum(),
					random.ints(1, 1, 26).sum()));
			patient.setFirstName(RandomString.make(7));
			patient.setLastName(RandomString.make(7));
			patient.setMiddleName(random.nextInt(2) == 0 ? RandomString.make(10) : null);
			patient.setEmailId(patient.getFirstName() + "." + patient.getLastName() + "@thelattice.in");
			patient.setJoiningDate(LocalDate.of(random.ints(1, 1989, 2021).sum(), random.ints(1, 1, 13).sum(),
					random.ints(1, 1, 26).sum()));
			patient.setJobTitle(jobTitleList.stream().skip(random.nextInt(jobTitleList.size())).findFirst().get());
			employeeList.add(patient);
		}

		employeeRepository.saveAll(employeeList);
	}

}
