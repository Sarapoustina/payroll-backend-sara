package com.example.payroll.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@PreAuthorize("hasRole('SUPER_ADMIN')")
public class AdminController {

    @GetMapping("/dashboard")
    public ResponseEntity<String> getDashboard() {
        return ResponseEntity.ok("Dashboard for SUPER_ADMIN only.");
    }

    @PostMapping("/create-hr")
    public ResponseEntity<String> createHrAdmin() {
        return ResponseEntity.ok("HR Admin created by SUPER_ADMIN.");
    }
}
