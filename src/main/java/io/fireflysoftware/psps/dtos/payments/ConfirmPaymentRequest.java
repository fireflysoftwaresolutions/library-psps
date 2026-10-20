/*
 * Copyright 2025 Firefly Software Foundation
 */
package io.fireflysoftware.psps.dtos.payments;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ConfirmPaymentRequest {
    private String paymentId;
    private String paymentMethodId;
    private String returnUrl;
}
