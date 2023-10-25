package com.example.poc.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomError {
    HttpStatus httpStatus;
    String customErrorMessage;
    Throwable body;
}
