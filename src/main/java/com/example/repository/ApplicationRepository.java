package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {

	boolean existsByStudentIdAndJobId(int studentId, int jobId);

}