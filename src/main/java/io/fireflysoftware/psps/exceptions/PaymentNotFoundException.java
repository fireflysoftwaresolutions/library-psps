package io.fireflysoftware.psps.exceptions;
public class PaymentNotFoundException extends PspException {
    public PaymentNotFoundException(String paymentId) { super("Payment not found: " + paymentId); }
}
