package com.example.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	private LocalDate applicationDate;

	private String status;

	private int studentId;

	@ManyToOne

	@JoinColumn(name = "job_id")

	private Job job;

	public Application() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {

		this.applicationDate = applicationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {

		this.studentId = studentId;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {

		this.job = job;
	}
}