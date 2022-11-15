package animals;

public class PositiveAgeException extends Exception{
    public PositiveAgeException() {
    }

    public PositiveAgeException(String message) {
        super(message);
    }

    public PositiveAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PositiveAgeException(Throwable cause) {
        super(cause);
    }

    public PositiveAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
