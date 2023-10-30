package com.lld.BMS.models;

import com.lld.BMS.enums.PaymentStatus;
import com.lld.BMS.enums.PaymentType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment extends BaseModel {

    private int refNo;
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;
}