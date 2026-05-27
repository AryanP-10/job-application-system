package com.example.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ApplyRequest;
import com.example.entity.Application;
import com.example.entity.Job;
import com.example.exception.DuplicateApplicationException;
import com.example.repository.ApplicationRepository;
import com.example.repository.JobRepository;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository appRepo;

	@Autowired
	private JobRepository jobRepo;

	public Application apply(ApplyRequest req) {

		Job job = jobRepo.findById(req.getJobId()).orElseThrow();

		boolean exists = appRepo.existsByStudentIdAndJobId(req.getStudentId(), req.getJobId());

		if (exists) {

			throw new DuplicateApplicationException("Already applied");
		}

		Application app = new Application();

		app.setStudentId(req.getStudentId());

		app.setApplicationDate(LocalDate.now());

		app.setStatus("APPLIED");

		app.setJob(job);

		return appRepo.save(app);
	}

	public List<Application> getApplications() {

		return appRepo.findAll();
	}
}