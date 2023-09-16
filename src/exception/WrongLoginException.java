package exception;

public class WrongLoginException extends Exception {
    public WrongLoginException(String errorMessage) {
        super(errorMessage);
    }
}
