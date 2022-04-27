package com.service.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice

public class PMSBusinessException extends ResponseEntityExceptionHandler {
	@ExceptionHandler(NameNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(NameNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(611);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AddressNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(AddressNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(612);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmailNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(EmailNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(613);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ContactNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(ContactNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(614);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DOBNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(DOBNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(615);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(TenthMarksNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(TenthMarksNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(616);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(TwelthMarksNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(TwelthMarksNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(617);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UGMarksNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(UGMarksNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(618);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<PMSException> resourceNotFound(RecordNotFoundException ex){
		PMSException response = new PMSException();
		response.setErrorCode(619);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			errors.put(fieldName, message);
		});
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}
	
}
