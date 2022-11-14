package animals;

public class PrizesException extends RuntimeException{
    public PrizesException() {
    }

    public PrizesException(String message) {
        super(message);
    }

    public PrizesException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrizesException(Throwable cause) {
        super(cause);
    }

    public PrizesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
