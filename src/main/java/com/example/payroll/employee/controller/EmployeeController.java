package com.example.payroll.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
@PreAuthorize("hasRole('EMPLOYEE')")
public class EmployeeController {

    @GetMapping("/profile")
    public ResponseEntity<String> getEmployeeProfile() {
        return ResponseEntity.ok("Employee profile data.");
    }

    @GetMapping("/self-leave-status")
    public ResponseEntity<String> checkLeaveStatus() {
        return ResponseEntity.ok("Leave status for EMPLOYEE.");
    }
}
