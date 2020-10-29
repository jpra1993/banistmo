package co.com.banistmo.certificacion.exceptions;

public class ValidatePdfException extends AssertionError {
    public ValidatePdfException(String constants, Throwable throwable) {
        super(constants, throwable);
    }
}
