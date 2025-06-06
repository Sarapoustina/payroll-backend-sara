package com.example.payroll.hr.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hr")
@PreAuthorize("hasRole('HR_ADMIN')")
public class HrController {

    @GetMapping("/employee-list")
    public ResponseEntity<String> getAllEmployees() {
        return ResponseEntity.ok("List of employees (accessible by HR only).");
    }

    @PostMapping("/approve-leave")
    public ResponseEntity<String> approveLeave() {
        return ResponseEntity.ok("Leave approved by HR_ADMIN.");
    }
}
