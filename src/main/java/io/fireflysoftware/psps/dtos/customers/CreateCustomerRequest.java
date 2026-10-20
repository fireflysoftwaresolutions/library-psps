package io.fireflysoftware.psps.dtos.customers;
import io.fireflysoftware.psps.domain.CustomerInfo;
import lombok.*;
@Data @Builder public class CreateCustomerRequest {
    private CustomerInfo customerInfo;
}
