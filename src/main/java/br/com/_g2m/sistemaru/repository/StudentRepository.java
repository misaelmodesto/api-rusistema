package br.com._g2m.sistemaru.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com._g2m.sistemaru.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
} 