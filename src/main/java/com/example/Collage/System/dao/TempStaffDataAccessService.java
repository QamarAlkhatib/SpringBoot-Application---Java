package com.example.Collage.System.dao;

import com.example.Collage.System.modal.Staff;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("TempDaoStaff")
public class TempStaffDataAccessService implements StaffDao{

    private static final List<Staff> staffDB = new ArrayList<>();
    @Override
    public int insertStaff(UUID id, Staff staff) {
        staffDB.add(new Staff(id,staff.getName(),staff.getNationalIdNum(),staff.getContactNumber(),staff.getNumberOfExperience(),staff.getCountryOfUniversity(),staff.getPostGraduateQualification(),staff.getDoB()));
        return 1;
    }
    @Override
    public List<Staff> selectAllStaff() {
        return staffDB;
    }

    @Override
    public Optional<Staff> selectStaffById(UUID id) {
        return staffDB.stream().filter(staff -> staff.getId().equals(id)).findFirst();
    }
}
