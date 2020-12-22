package org.techhub.DemoJobPortalApp.service;

import java.util.List;

import org.techhub.DemoJobPortalApp.model.JobModel;
import org.techhub.DemoJobPortalApp.model.Product;

public interface JobService {
	public boolean isAddNewJob(JobModel model);
	public List<JobModel> getJobs();
	public boolean isDeleteCompany(int cid);
	public boolean isUpdateCompany(JobModel model);
	public List<Product> getProductByName(String name);
}
