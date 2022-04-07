package com.example.Collage.System.dao;

import com.example.Collage.System.modal.Address;
import com.example.Collage.System.modal.Staff;
import com.example.Collage.System.modal.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("TempDao")
public class TempStudentDataAccessService implements StudentDao{

//    temp Database using ArrayList
    private static final List<Student> DB = new ArrayList<>();


    @Override
    public int insertStudent(UUID id, Student student) {
//        adding the new student into DB using arraylist method
        DB.add(new Student(id,student.getName(),student.getDob(),student.getContactNumber()));
        return 1;
    }
    @Override
    public List<Student> selectAllStudent() {
        return DB;
    }

    @Override
    public Optional<Student> selectStudentById(UUID id) {
        return DB.stream().filter(student -> student.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteStudentById(UUID id) {
        Optional<Student> studentToDelete = selectStudentById(id);
        if(studentToDelete.isEmpty()){
            return 0;
        }
        DB.remove((studentToDelete.get()));
        return 1;
    }

    @Override
    public int updateStudentById(UUID id, Student student) {
        return selectStudentById(id).map(s -> {
            int indexOfStudentToUpdate = DB.indexOf(s);
            if (indexOfStudentToUpdate >=0){
                DB.set(indexOfStudentToUpdate,new Student(id, student.getName(),student.getDob(),student.getContactNumber()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
