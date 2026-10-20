package io.fireflysoftware.psps.dtos.refunds;
import io.fireflysoftware.psps.domain.Money;
import lombok.*;
@Data @Builder public class CreateRefundRequest {
    private String paymentId;
    private Money amount;
    private String reason;
}
