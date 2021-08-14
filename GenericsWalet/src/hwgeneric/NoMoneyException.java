package hwgeneric;

public class NoMoneyException extends RuntimeException{
    public NoMoneyException(String message) {
        super(message);
    }
}
