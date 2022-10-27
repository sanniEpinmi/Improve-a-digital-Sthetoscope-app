package com.typhoid.sannimichael.patient.utility;

import com.typhoid.sannimichael.patient.entity.Patient;


public class ExcelCellUtils {

	public static String getValue(final int columnIndex, final Patient patient) {
		switch (columnIndex) {
		case 0: {
			return patient.getId().toString();
		}
		case 1: {
			return patient.getEmailId();
		}
		case 2: {
			return patient.getDateOfBirth().toString();
		}
		case 3: {
			return patient.getFirstName();
		}
		case 4: {
			return patient.getMiddleName();
		}
		case 5: {
			return patient.getLastName();
		}
		case 6: {
			return patient.getJobTitle();
		}
		case 7: {
			return patient.getJoiningDate().toString();
		}
		case 8: {
			return patient.isInfected() ? "true" : "false";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + columnIndex);
		}
	}

}
