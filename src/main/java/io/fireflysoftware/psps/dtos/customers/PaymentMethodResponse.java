package io.fireflysoftware.psps.dtos.customers;
import io.fireflysoftware.psps.domain.PaymentMethodType;
import lombok.*;
@Data @Builder public class PaymentMethodResponse {
    private String paymentMethodId;
    private PaymentMethodType type;
    private Object details;
}
