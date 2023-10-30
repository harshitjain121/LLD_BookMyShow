package com.lld.BMS.enums;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

public enum PaymentStatus {
    SUCCESSFUL,
    FAILED,
    INPROGRESS,
    REFUND
}