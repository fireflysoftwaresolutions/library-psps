package io.fireflysoftware.psps.dtos.checkout;
import io.fireflysoftware.psps.domain.*;
import lombok.*;
import java.time.Instant;
import java.util.Map;
@Data @Builder public class PaymentIntentResponse {
    private String intentId;
    private String clientSecret;
    private Money amount;
    private String customerId;
    private PaymentStatus status;
    private String paymentMethodId;
    private String description;
    private Instant createdAt;
    private Map<String, String> metadata;
    private Object nextAction;
}
