package io.fireflysoftware.psps.dtos.payments;
import io.fireflysoftware.psps.domain.Money;
import lombok.*;
@Data @Builder public class CapturePaymentRequest {
    private String paymentId;
    private Money amount;
}
