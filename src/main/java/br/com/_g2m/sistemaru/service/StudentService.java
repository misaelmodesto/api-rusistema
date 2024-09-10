package br.com._g2m.sistemaru.service;

import org.springframework.stereotype.Service;

import br.com._g2m.sistemaru.repository.StudentRepository;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    
}
