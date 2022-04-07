package com.example.Collage.System.service;

import com.example.Collage.System.dao.StaffDao;
import com.example.Collage.System.modal.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StaffService {

    public final StaffDao staffDao;

    @Autowired
    public StaffService(@Qualifier("TempDaoStaff") StaffDao staffDao) {
        this.staffDao = staffDao;
    }
    public int addStaff(Staff staff){
        return staffDao.insertStaff(staff);
    }
    public List<Staff> getAllStaff(){
        return staffDao.selectAllStaff();
    }

    public Optional<Staff> getStaffById(UUID id) {
        return staffDao.selectStaffById(id);
    }


}
