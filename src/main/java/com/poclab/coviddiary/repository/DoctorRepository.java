package com.poclab.coviddiary.repository;

import com.poclab.coviddiary.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

  Optional<Doctor> findByEmail(String email);

}