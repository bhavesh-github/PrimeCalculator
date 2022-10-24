package com.nw.primenum.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.nw.primenum.entity.ResponseData;

@ControllerAdvice
@ResponseBody
public class ControllerExceptionHandler {
	
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseData invalidArgumentRequestException(MethodArgumentTypeMismatchException ex, WebRequest request) {
		ResponseData responseData = new ResponseData();
		responseData.setErrorMessage("Please provide valid parameter(Whole number)");
		responseData.setStatusCode(400);
		responseData.setSuccess(false);
        return responseData;
    }
	
	@ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseData noArgumentRequestException(MissingServletRequestParameterException ex, WebRequest request) {
		ResponseData responseData= new ResponseData();
		responseData.setErrorMessage("Please provide parameter upperLimit with valid integer value");
		responseData.setStatusCode(400);
		responseData.setSuccess(false);
        return responseData;
    }
	
	
}