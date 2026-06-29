package com.project.mylearning.hospitalManagement.repository;

import com.project.mylearning.hospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}