package com.ayaz.exception;


import com.ayaz.enums.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.NoSuchElementException;

@ControllerAdvice
@RestController
public class ExceptionController {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error validationErrorMethodArgument(MethodArgumentNotValidException e){
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        Error error = new Error();
        error.setCode(ErrorCode.METHOD_ARGUMENT_NOT_VALID_EXCEPTION);
        error.setMessage(message);
        return  error;
    }
    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error validationException(ValidationException e){
        String message = e.getMessage();
        Error error = new Error();
        error.setCode(ErrorCode.VALIDATION_EXCEPTION);
        error.setMessage(message);
        return  error;
    }
    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error nosuchElementExcp(NoSuchElementException e){
        String message = e.getMessage();
        Error error = new Error();
        error.setCode(ErrorCode.NO_SUCH_ELEMENT_EXCEPTION);
        error.setMessage(message);
        return  error;
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error validateErrorMethodArgument(HttpRequestMethodNotSupportedException e){
        String message = e.getMessage();
        Error error = new Error();
        error.setCode(ErrorCode.HTTP_REQUEST_METHOD_NOT_SUPPORTA_EXCEPTION);
        error.setMessage(message);
        return  error;
    }
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error validateTypeNotSupport(HttpMediaTypeNotSupportedException e){
        String message = e.getMessage();
        Error error = new Error();
        error.setCode(ErrorCode.HTTP_MEDIA_TYPE_NOT_SUPPORTED_EXCEPTION);
        error.setMessage(message);
        return  error;
    }
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error validateConstraintViolation(ConstraintViolationException e){
        String message = e.getMessage();
        Error error = new Error();
        error.setCode(ErrorCode.CONSTRAINT_VIOLATION_EXCEPTION);
        error.setMessage(message);
        return  error;
    }



}