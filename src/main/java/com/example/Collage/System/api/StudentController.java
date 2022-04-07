package com.example.Collage.System.api;

import com.example.Collage.System.modal.Staff;
import com.example.Collage.System.modal.Student;
import com.example.Collage.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/student")
@RestController
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
//    Adds new student
    public void addStudent(@RequestBody Student student){
         studentService.addStudent(student);
    }
    @GetMapping
//    Returning list of all student
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

//    Returning student by id
    @GetMapping(path="/{id}")
    public Student getStudentById(@PathVariable("id") UUID id){
        return studentService.getStudentById(id).orElse(null);
    }
    @DeleteMapping(path="{id}")
    public void deleteStudentById(@PathVariable("id") UUID id){
        studentService.deleteStudent(id);
    }

    @PutMapping(path="{id}")
    public void updatePerson(@PathVariable("id") UUID id,@RequestBody Student studentToUpdate){
        studentService.updateStudent(id,studentToUpdate);
    }
}
