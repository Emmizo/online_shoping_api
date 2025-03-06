package com.ecommerce.ecommerce_backend.modal;

import com.ecommerce.ecommerce_backend.domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {
    private String paymentId;
    private String razorpayPaymentId;
    private String razorpayPaymentReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentZWSP;
    private PaymentStatus status;
}
