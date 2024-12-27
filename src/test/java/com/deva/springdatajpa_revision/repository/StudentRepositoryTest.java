package com.deva.springdatajpa_revision.repository;

import com.deva.springdatajpa_revision.models.Student;
import com.deva.springdatajpa_revision.models.Guardian;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student .builder()
                .emailId("devashishrai2000@gmail.com")
                .firstName("devashish")
                .lastName("rai")
//                .gaurdianName("madan rai")
//                .guardianEmail("madanrai2000@gmail.com")
//                .guardianMobile("9999977777")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGaurdian(){
        Guardian gaurdian = Guardian.builder()
                .name("dad")
                .email("dad@shamani.com")
                .mobile("7897987897")
                .build();
        Student student = Student.builder()
                .firstName("raj")
                .lastName("shamani")
                .emailId("raj@shamani.com")
                .guardian(gaurdian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
    }

}