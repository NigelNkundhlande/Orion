package com.dentalsuite.dentalsuiteapp.repositories;

import com.dentalsuite.dentalsuiteapp.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatientId(Long patientId);
    List<Appointment> findByDentistId(Long dentistId);
}
