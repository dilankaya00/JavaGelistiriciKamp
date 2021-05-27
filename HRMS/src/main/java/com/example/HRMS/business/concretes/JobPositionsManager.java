package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HRMS.business.abstracts.JobPositionsService;
import com.example.HRMS.dataAccess.abstracts.JobPositionsDao;
import com.example.HRMS.entities.concretes.JobPositions;

@Service
public class JobPositionsManager  implements JobPositionsService{

	private JobPositionsDao jobPositionsDao;
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}

	
	@Override
	public List<JobPositions> getAll() {
		
		return this.jobPositionsDao.findAll();
	}
	

	

}
