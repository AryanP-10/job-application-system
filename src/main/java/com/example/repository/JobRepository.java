package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}