package com.project.mylearning.hospitalManagement.repository;

import com.project.mylearning.hospitalManagement.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}