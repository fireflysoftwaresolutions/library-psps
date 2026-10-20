package io.fireflysoftware.psps.dtos.subscriptions;
import lombok.*;
@Data @Builder public class ListPricingPlansRequest {
    private Boolean activeOnly;
    private Integer limit;
    private String startingAfter;
}
