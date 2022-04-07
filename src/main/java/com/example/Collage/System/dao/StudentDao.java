package com.example.Collage.System.dao;
import com.example.Collage.System.modal.Student;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentDao {

//    Method that adds a new student
int insertStudent(UUID id, Student student);

    default int insertStudent(Student student){
        UUID id = UUID.randomUUID();
        return insertStudent(id,student);
    }
    List<Student> selectAllStudent();
    Optional<Student> selectStudentById(UUID id);
    int deleteStudentById(UUID id);
    int updateStudentById(UUID id,Student student);
}
