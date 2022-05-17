package com.exercise.kimbo.parking.entity;

import org.springframework.http.HttpStatus;

class HttpErrorException extends RuntimeException {
    private HttpStatus status;
    private String error;
    private String errorMessage;

    HttpStatus getStatus() {
        return this.status;
    }

    String getError() {
        return this.error;
    }

    String getErrorMessage() {
        return this.errorMessage;
    }

    HttpErrorException(HttpStatus status, String error, String errorMessage) {
        this.status = status;
        this.error = error;
        this.errorMessage = errorMessage;
    }
}
