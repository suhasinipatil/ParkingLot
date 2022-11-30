package models;

import java.util.Date;

public class Payment extends BaseModel{
    private String referenceNumber;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;

    private double amount;

    private Date timeOfPayment;

    private Invoice invoice;

    public PaymentMode getMode() {
        return paymentMode;
    }

    public void setMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


}
