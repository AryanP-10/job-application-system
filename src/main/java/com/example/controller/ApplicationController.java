package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dto.ApplyRequest;
import com.example.entity.Application;
import com.example.service.ApplicationService;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

	@Autowired
	private ApplicationService service;

	@PostMapping("/apply")
	public Application apply(@RequestBody ApplyRequest req) {

		return service.apply(req);
	}

	@GetMapping
	public List<Application> getApplications() {

		return service.getApplications();
	}
}