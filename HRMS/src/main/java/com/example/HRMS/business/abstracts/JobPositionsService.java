package com.example.HRMS.business.abstracts;

import java.util.List;

import com.example.HRMS.entities.concretes.JobPositions;


public interface JobPositionsService {
 
	List<JobPositions> getAll();
	
}
