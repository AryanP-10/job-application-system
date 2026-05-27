package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Job;
import com.example.repository.JobRepository;

@Service
public class JobService {

	@Autowired
	private JobRepository repository;

	public Job saveJob(Job job) {

		return repository.save(job);
	}

	public List<Job> getJobs() {

		return repository.findAll();
	}

	public Job getJobById(int id) {

		return repository.findById(id).orElse(null);
	}
}