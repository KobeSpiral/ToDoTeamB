package jp.kobespiral.todo.exception;

public class HelloExceptionException extends RuntimeException{
  private static final long serialVersionUID = 1L;
    public HelloExceptionException(String message) {
        super(message);
    }
}