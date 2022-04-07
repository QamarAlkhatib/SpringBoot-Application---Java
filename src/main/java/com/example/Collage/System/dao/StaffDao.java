package com.example.Collage.System.dao;

import com.example.Collage.System.modal.Staff;
import com.example.Collage.System.modal.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StaffDao {

    int insertStaff(UUID id, Staff staff);

    default int insertStaff(Staff staff){
        UUID id = UUID.randomUUID();
        return insertStaff(id,staff);
    }
    List<Staff> selectAllStaff();

    Optional<Staff> selectStaffById(UUID id);

}
