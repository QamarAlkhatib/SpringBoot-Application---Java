package com.example.Collage.System.service;

import com.example.Collage.System.dao.StudentDao;
import com.example.Collage.System.modal.Staff;
import com.example.Collage.System.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    public final StudentDao studentDao;
    @Autowired
    public StudentService(@Qualifier("TempDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    public int addStudent(Student student){
        return studentDao.insertStudent(student);
    }
    public List<Student> getAllStudent(){
        return studentDao.selectAllStudent();
    }
    public Optional<Student> getStudentById(UUID id) {
        return studentDao.selectStudentById(id);
    }
    public int deleteStudent(UUID id){
        return studentDao.deleteStudentById(id);
    }
    public int updateStudent(UUID id,Student student){
        return studentDao.updateStudentById(id,student);
    }

}
