package org.techhub.DemoJobPortalApp.repository;

import java.util.List;

import org.techhub.DemoJobPortalApp.model.JobModel;
import org.techhub.DemoJobPortalApp.model.Product;

public interface JobRepository {
	public boolean isAddNewJob(JobModel model);
	public List<JobModel> getJobs();
	public boolean isDeleteCompany(Integer cid);
	public boolean isUpdateCompany(JobModel model);
	public List<Product> getProductByName(String name);

}
