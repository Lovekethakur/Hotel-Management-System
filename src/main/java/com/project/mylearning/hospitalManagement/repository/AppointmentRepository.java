package com.project.mylearning.hospitalManagement.repository;

import com.project.mylearning.hospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}