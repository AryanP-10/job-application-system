package com.example.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Job {

	@Id
	private int id;

	private String companyName;

	private String role;

	private double packageAmount;

	private String location;

	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)

	private List<Application> applications = new ArrayList<>();

	public Job() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {

		this.companyName = companyName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {

		this.role = role;
	}

	public double getPackageAmount() {
		return packageAmount;
	}

	public void setPackageAmount(double packageAmount) {

		this.packageAmount = packageAmount;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {

		this.location = location;
	}
}