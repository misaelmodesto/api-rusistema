package br.com._g2m.sistemaru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com._g2m.sistemaru.repository.StudentRepository;
import br.com._g2m.sistemaru.dtos.StudentResponseDTO;
import br.com._g2m.sistemaru.dtos.StudentRequestDTO;
import br.com._g2m.sistemaru.entity.Student;



@RestController
@RequestMapping("Student")
public class StudentController {

    @Autowired
    private StudentRepository studentrepository;

    //@CrossOrigin(origins = "*", allowCredentials = "*")
    @PostMapping
    public void saveStudent(@RequestBody StudentRequestDTO data){
        Student studentData = new Student(data);
        studentrepository.save(studentData);
        return;
    }
    
    //@CrossOrigin(origins = "*", allowCredentials = "*")
    @GetMapping
    public List<StudentResponseDTO> getAll(){

        List<StudentResponseDTO> studentList = studentrepository.findAll().stream().map(StudentResponseDTO::new).toList();
        return studentList;
    }
}
