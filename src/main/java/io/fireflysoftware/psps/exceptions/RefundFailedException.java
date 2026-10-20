package io.fireflysoftware.psps.exceptions;
public class RefundFailedException extends PspException {
    public RefundFailedException(String message) { super(message); }
    public RefundFailedException(String message, Throwable cause) { super(message, cause); }
}
