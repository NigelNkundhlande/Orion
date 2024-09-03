package com.dentalsuite.dentalsuiteapp.repositories;

import com.dentalsuite.dentalsuiteapp.entities.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
