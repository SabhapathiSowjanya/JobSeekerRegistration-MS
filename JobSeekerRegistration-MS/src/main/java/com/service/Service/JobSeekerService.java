package com.service.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.Model.JobSeeker;
import com.service.Repository.JobSeekerRepo;

@Service
public class JobSeekerService {
	@Autowired
	JobSeekerRepo jobseekerRepo;
	
	public JobSeeker addJobseeker(JobSeeker jobseekerobj) {
		jobseekerobj=jobseekerRepo.save(typeJobSeeker(jobseekerobj));
		return jobseekerRepo.save(jobseekerobj);
		
	}
	
	public List<JobSeeker> getAllJobseeker(){
		return (List<JobSeeker>) jobseekerRepo.findAll();
	}
	
	
	public JobSeeker typeJobSeeker(JobSeeker obj) {
		JobSeekerService jobSeekerService;
		if (obj.getTenthMarks() >= 90 && obj.getTwelthMarks() >= 90 && obj.getUgMarks() >= 90) {
			obj.setType("GOLD");
		} else if (obj.getTenthMarks() >= 85 && obj.getTwelthMarks() >= 85 && obj.getUgMarks() >= 85) {
			obj.setType("SILVER");
		} else {
			obj.setType("NORMAL");
		}
		return obj; // return obj.addJobseeker(setType());

	}

	

	 	 
}