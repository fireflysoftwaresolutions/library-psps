package io.fireflysoftware.psps.dtos.subscriptions;
import io.fireflysoftware.psps.domain.SubscriptionStatus;
import lombok.*;
@Data @Builder public class ListSubscriptionsRequest {
    private SubscriptionStatus status;
    private Integer limit;
    private String startingAfter;
}
