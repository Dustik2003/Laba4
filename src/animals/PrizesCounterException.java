package animals;

public class PrizesCounterException extends RuntimeException{
    public PrizesCounterException() {
    }

    public PrizesCounterException(String message) {
        super(message);
    }

    public PrizesCounterException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrizesCounterException(Throwable cause) {
        super(cause);
    }

    public PrizesCounterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
