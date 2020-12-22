package org.techhub.DemoJobPortalApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.DemoJobPortalApp.model.JobModel;
import org.techhub.DemoJobPortalApp.model.Product;
import org.techhub.DemoJobPortalApp.repository.JobRepository;

@Service("jobService")
public class JobServiceImpl implements JobService {

	@Autowired
	JobRepository jobRepository;
	
	@Override
	public boolean isAddNewJob(JobModel model) {
		// TODO Auto-generated method stub
		return jobRepository.isAddNewJob(model);
	}

	@Override
	public List<JobModel> getJobs() {
		// TODO Auto-generated method stub
		return jobRepository.getJobs();
	}

	@Override
	public boolean isDeleteCompany(int cid) {
		// TODO Auto-generated method stub
		return jobRepository.isDeleteCompany(cid);
	}

	@Override
	public boolean isUpdateCompany(JobModel model) {
		// TODO Auto-generated method stub
		return jobRepository.isUpdateCompany(model);
	}

	@Override
	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		
		return jobRepository.getProductByName(name);
	}

}
