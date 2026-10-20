package io.fireflysoftware.psps.dtos.checkout;
import io.fireflysoftware.psps.domain.Money;
import lombok.*;
@Data @Builder public class CheckoutLineItem {
    private String name;
    private String description;
    private Money price;
    private Integer quantity;
    private String planId;
}
