package com.testproject.admissionsservice.resources;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.testproject.admissionsservice.models.DiseasesList;
import com.testproject.admissionsservice.models.EmployeesList;
import com.testproject.admissionsservice.models.Patient;

@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {
	
	@Autowired
	private RestTemplate restTemplate;

	List<Patient> patients = Arrays.asList(
			new Patient("P1","Kajal","Indian"),
			new Patient("P2","Ankita","Indian"),
			new Patient("P3","Emily","American") );
	
	@RequestMapping("/physicians")
	public EmployeesList getPhysicians() {
		EmployeesList employeesList=restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);
		return employeesList;
	}
	
	@RequestMapping("/diseases")
	public DiseasesList getDiseases() {
		DiseasesList diseases = 
				restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseasesList.class);
		return diseases;
	}
	
	@RequestMapping("/patients")
	public List<Patient> getPatients(){
		return patients;
	}

	@RequestMapping("/patients/{Id}")
	public Patient getPatientById(@PathVariable("Id")String Id) {
		Patient p = patients.stream()
				.filter(patient -> Id.contentEquals(patient.getId()))
				.findAny()
				.orElse(null);
		return p;
		
	}
}
