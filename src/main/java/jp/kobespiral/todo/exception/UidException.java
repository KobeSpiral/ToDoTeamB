package jp.kobespiral.todo.exception;

public class UidException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public UidException(String message) {
        super(message);
    }
}