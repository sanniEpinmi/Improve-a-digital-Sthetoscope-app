package com.typhoid.sannimichael.patient.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.typhoid.sannimichael.patient.constant.ApiConstant;
import com.typhoid.sannimichael.patient.excel.service.PatientServiceExcel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = ApiConstant.EXCEL_CONTROLLER_BASE_PATH)
public class ExcelController {

	private final PatientServiceExcel excelService;

	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	@Operation(summary = ApiConstant.GENERATE_EXCEL_SUMMARY)
	public void employeeExcelGenerationHandler(final HttpServletResponse httpServletResponse) throws IOException {
		excelService.generate(httpServletResponse);
	}

}
