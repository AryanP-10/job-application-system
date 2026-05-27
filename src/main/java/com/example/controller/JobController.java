package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Job;
import com.example.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {

	@Autowired
	private JobService service;

	@PostMapping
	public Job saveJob(@RequestBody Job job) {

		return service.saveJob(job);
	}

	@GetMapping
	public List<Job> getJobs() {

		return service.getJobs();
	}

	@GetMapping("/{id}")
	public Job getJobById(@PathVariable int id) {

		return service.getJobById(id);
	}
}