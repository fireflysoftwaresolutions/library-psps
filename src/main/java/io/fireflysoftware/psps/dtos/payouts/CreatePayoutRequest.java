package io.fireflysoftware.psps.dtos.payouts;
import io.fireflysoftware.psps.domain.Money;
import lombok.*;
@Data @Builder public class CreatePayoutRequest {
    private Money amount;
    private String destination;
    private String description;
}
