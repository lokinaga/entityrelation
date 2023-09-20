
package com.vehicle.globalhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vehicle.customexception.BrandNotFoundException;
import com.vehicle.customexception.IdNotFoundException;
import com.vehicle.customexception.InvalidBoardException;

@RestControllerAdvice
public class GlobalHandling {
	@ExceptionHandler(BrandNotFoundException.class)
	public ResponseEntity<Object> brandHandling() {
		return new ResponseEntity<>("brand does not found",HttpStatus.BAD_REQUEST);
	}
//	@ExceptionHandler(InvalidBoardException.class)
//	public ReponseEntity<Object> invalidHandling() {
//		return new ReponseEntity<>("board does not found",HttpStatus.BAD_REQUEST);
//	}
//	
	@ExceptionHandler(IdNotFoundException.class)
   public ResponseEntity<Object> idHandling(){
	   return new ResponseEntity<>("id does not found",HttpStatus.BAD_REQUEST);
   }
}
