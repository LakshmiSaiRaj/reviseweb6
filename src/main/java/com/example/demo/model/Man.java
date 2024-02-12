package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Man {
	@Id
	private int aid;
	private String aname;
	private String atech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	@Override
	public String toString() {
		return "Man [aid=" + aid + ", aname=" + aname + ", atech=" + atech + "]";
	}
	
	
}
