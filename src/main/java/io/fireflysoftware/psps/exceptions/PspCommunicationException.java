package io.fireflysoftware.psps.exceptions;
public class PspCommunicationException extends PspException {
    public PspCommunicationException(String message) { super(message); }
    public PspCommunicationException(String message, Throwable cause) { super(message, cause); }
}
