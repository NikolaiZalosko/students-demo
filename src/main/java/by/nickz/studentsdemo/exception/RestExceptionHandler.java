package by.nickz.studentsdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
    return handleExceptionInternal(ex, HttpStatus.NOT_FOUND);
  }

  private ResponseEntity<Object> handleExceptionInternal(Exception ex, HttpStatus status) {
    return new ResponseEntity<>(ErrorResponse.builder()
        .error(ex.getMessage())
        .build(), status);
  }
}
