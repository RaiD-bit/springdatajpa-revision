package com.deva.springdatajpa_revision.repository;

import com.deva.springdatajpa_revision.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
