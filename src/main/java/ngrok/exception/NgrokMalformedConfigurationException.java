package ngrok.exception;

public class NgrokMalformedConfigurationException extends RuntimeException {
    public NgrokMalformedConfigurationException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
