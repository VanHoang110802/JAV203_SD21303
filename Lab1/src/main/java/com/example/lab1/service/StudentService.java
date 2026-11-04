package com.example.lab1.service;

import com.example.lab1.entity.Student;
import com.example.lab1.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Lấy danh sách sinh viên
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Thêm sinh viên
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // Tìm sinh viên theo ID
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Xóa sinh viên
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
