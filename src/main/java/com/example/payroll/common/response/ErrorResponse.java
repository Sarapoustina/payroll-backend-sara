package com.example.payroll.common.response;

import java.time.LocalDateTime;

public class ErrorResponse {
    private int status;
    private String error;
    private LocalDateTime timestamp;
    private String path;

    public ErrorResponse(int status, String error, String path) {
        this.status = status;
        this.error = error;
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }

    public int getStatus() { return status; }
    public String getError() { return error; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getPath() { return path; }

    public void setStatus(int status) { this.status = status; }
    public void setError(String error) { this.error = error; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    public void setPath(String path) { this.path = path; }
}
