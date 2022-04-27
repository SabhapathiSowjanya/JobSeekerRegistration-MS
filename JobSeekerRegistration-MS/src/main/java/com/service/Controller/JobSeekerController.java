package com.service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Model.JobSeeker;
import com.service.Service.JobSeekerService;

@RestController
@RequestMapping("/JobSeeker")
public class JobSeekerController {

	@Autowired
	JobSeekerService jobseekerService;
	
	
	@PostMapping("/addJobSeeker")
	public ResponseEntity<String> addJobseekerDetails(@Validated @RequestBody JobSeeker jobseeker) {
		JobSeeker jsResponse = jobseekerService.addJobseeker(jobseeker);
		return new ResponseEntity<String>("Jobseeker has been successfully registered into the system, the Jobseeker  ID is: " + "J"
						+ jsResponse.getJobSeekerId(),HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllJobSeeker")
	public ResponseEntity<List<JobSeeker>> fetchAllJobSeeker(){
		List<JobSeeker> jsObj = jobseekerService.getAllJobseeker();
		return new ResponseEntity<List<JobSeeker>>(jsObj,HttpStatus.OK);
	}
	
	
	
	
}