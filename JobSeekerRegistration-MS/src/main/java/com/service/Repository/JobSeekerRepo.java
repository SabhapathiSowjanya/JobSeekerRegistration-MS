package com.service.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Model.JobSeeker;

@Repository
public interface JobSeekerRepo extends JpaRepository<JobSeeker,String> {
	
	
}
