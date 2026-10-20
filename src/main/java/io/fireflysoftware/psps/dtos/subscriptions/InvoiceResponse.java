package io.fireflysoftware.psps.dtos.subscriptions;
import io.fireflysoftware.psps.domain.Money;
import lombok.*;
import java.time.Instant;
import java.util.List;
@Data @Builder public class InvoiceResponse {
    private String invoiceId;
    private String subscriptionId;
    private String customerId;
    private Money amountDue;
    private Money amountPaid;
    private String status;
    private Instant dueDate;
    private Instant paidAt;
    private List<InvoiceLineItem> lineItems;
    private Instant createdAt;
}
