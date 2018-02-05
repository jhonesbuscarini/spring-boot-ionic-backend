package com.jhones.cursomc.resource.exeption;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jhones.cursomc.services.execption.DataIntegrityExeption;
import com.jhones.cursomc.services.execption.ObjectNotFoundExecption;

@ControllerAdvice
public class ResourceExecptionHandler {

	@ExceptionHandler(ObjectNotFoundExecption.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundExecption e, HttpServletRequest request){
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
	@ExceptionHandler(DataIntegrityExeption.class)
	public ResponseEntity<StandardError> dataIntegrety(DataIntegrityExeption e, HttpServletRequest request){
		
		StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
}
