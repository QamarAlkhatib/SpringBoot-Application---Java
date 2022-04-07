package com.example.Collage.System.api;


import com.example.Collage.System.modal.Staff;
import com.example.Collage.System.modal.Student;
import com.example.Collage.System.service.StaffService;
import com.example.Collage.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RequestMapping("api/v1/staff")
@RestController
public class staffController {

    private final StaffService staffService;
    @Autowired
    public staffController(StaffService staffService) {
        this.staffService = staffService;
    }
    @PostMapping
//    Adds new student
    public void addStaff(@RequestBody Staff staff){
        staffService.addStaff(staff);
    }
    @GetMapping
//    Returning list of all student
    public List<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }
    @GetMapping(path="/{id}")
    public Staff getStaffById(@PathVariable("id") UUID id){
        return staffService.getStaffById(id).orElse(null);
    }
}
