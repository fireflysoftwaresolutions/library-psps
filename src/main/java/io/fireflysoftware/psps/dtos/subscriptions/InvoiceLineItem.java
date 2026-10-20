package io.fireflysoftware.psps.dtos.subscriptions;
import io.fireflysoftware.psps.domain.Money;
import lombok.*;
@Data @Builder public class InvoiceLineItem {
    private String description;
    private Integer quantity;
    private Money amount;
    private Money totalAmount;
}
