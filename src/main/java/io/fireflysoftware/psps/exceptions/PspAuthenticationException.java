package io.fireflysoftware.psps.exceptions;
public class PspAuthenticationException extends PspException {
    public PspAuthenticationException(String message) { super(message); }
    public PspAuthenticationException(String message, Throwable cause) { super(message, cause); }
}
