package com.example.demoRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Beans.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
