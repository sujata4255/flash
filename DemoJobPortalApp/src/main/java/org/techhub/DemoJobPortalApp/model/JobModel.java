package org.techhub.DemoJobPortalApp.model;

import java.sql.Date;

public class JobModel {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	private String pack;
	private String location;
	private Date lasttoapply;
	public Date getLasttoapply() {
		return lasttoapply;
	}

	public void setLasttoapply(Date lasttoapply) {
		this.lasttoapply = lasttoapply;
	}

	private String desc;

}
