package org.techhub.DemoJobPortalApp.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import org.techhub.DemoJobPortalApp.model.JobModel;
import org.techhub.DemoJobPortalApp.model.LoginModel;
import org.techhub.DemoJobPortalApp.model.Product;
import org.techhub.DemoJobPortalApp.model.Profile;
import org.techhub.DemoJobPortalApp.service.JobService;

@Controller
public class HomeController {

	@Autowired
	JobService jobService;

	
	@RequestMapping("/search")
	public String search()
	{
		return "search";
	}
	
	@RequestMapping("/searchspecific")//restful 
	@ResponseBody
	public  String searchSpecific(@RequestParam("name") String name)
	{   System.out.println(name);
		List<Product> list=jobService.getProductByName(name);
		String str="";
		str=str+"<table border='5'>";
		str=str+"<tr><th>Product Id</th><th>Product NAME</th><th>Product Price</th><th>Product Company</th></tr>";
		for(Product p:list)
		{
			str=str+"<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getPrice()+"</td><td>"+p.getCompany()+"</td></tr>";
		}
		return str; 
	}
	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String validateLogin(LoginModel model, Map map) {
		if (model.getName().equals("admin") && model.getPass().equals("admin")) {
			return "AdminMaster";
		} else {
			map.put("msg", "Invalid Username And Password");
			return "home";
		}

	}

	@RequestMapping("/addnewjob")
	public String addNewJob() {
		return "AddNewJob";
	}

	@RequestMapping("/savejob")
	public String saveJob(JobModel model, Map map) {

		boolean b = jobService.isAddNewJob(model);
		if (b) {
			map.put("msg", "Job Added Successfully..............");
		} else {
			map.put("msg", "Some Problem In Job Adding");
		}
		return "AddNewJob";
	}

	@RequestMapping("/viewjob")
	public ModelAndView viewJob() {
		List<JobModel> jobList = jobService.getJobs();
		ModelAndView modelview=new ModelAndView();
		modelview.addObject("jobList", jobList);
		modelview.setViewName("ViewJob");
		return modelview;
	}

	@RequestMapping("/delCompyById")
	public String deleteRecord(@RequestParam("cid") Integer cid,Map map) {
		 
		boolean b=jobService.isDeleteCompany(cid);
		List<JobModel> jobList = jobService.getJobs();
		map.put("jobList", jobList);
		return "ViewJob";
	}
	@RequestMapping("/uploadprofile")
	public String uploadProfile()
	{
		return "profile";
	}
	@RequestMapping("/updatejob")
	public String updateJob(@RequestParam("name") String name,@RequestParam("pack") String pack,@RequestParam("loc") String loc,@RequestParam("desc") String desc,@RequestParam("dapply") String dapply,@RequestParam("jid") Integer jid,Map map)
	{
		 map.put("name",name);
		 map.put("pack",pack);
		 map.put("loc",loc);
		 map.put("desc",desc);
		 map.put("dapply", dapply);
		 map.put("jid",jid);
		
		return "finalupdate";
	}
	@RequestMapping("/finalupdate")
	public String finalUpdate(JobModel model,Map map)
	{
		jobService.isUpdateCompany(model);
		List<JobModel> jobList = jobService.getJobs();
		map.put("jobList", jobList);
		return "ViewJob";
	}
	
	@RequestMapping(value="/uploadp",method=RequestMethod.POST)
	public String saveProfile(@RequestParam("file") MultipartFile file)
	{
		 String name=file.getOriginalFilename();
		 System.out.println("Name is "+name);
		 	
		return "profile";
	}
	
}



























