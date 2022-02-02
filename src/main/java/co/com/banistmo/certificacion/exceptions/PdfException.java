package co.com.banistmo.certificacion.exceptions;

public class PdfException extends AssertionError {
    public PdfException(String constants, Throwable throwable) {
        super(constants, throwable);
    }
}
