package animals;

public class NullNameException extends NullPointerException{
    public NullNameException() {
    }

    public NullNameException(String message) {
        super(message);
    }

}
