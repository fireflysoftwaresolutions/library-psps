package io.fireflysoftware.psps.dtos.payouts;
import io.fireflysoftware.psps.domain.Money;
import lombok.*;
import java.time.Instant;
@Data @Builder public class PayoutResponse {
    private String payoutId;
    private Money amount;
    private String status;
    private Instant createdAt;
}
