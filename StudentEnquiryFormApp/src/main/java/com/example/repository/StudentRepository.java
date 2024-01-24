package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentEnquiry;

@Repository
public interface StudentRepository extends JpaRepository<StudentEnquiry, Integer>{

}
