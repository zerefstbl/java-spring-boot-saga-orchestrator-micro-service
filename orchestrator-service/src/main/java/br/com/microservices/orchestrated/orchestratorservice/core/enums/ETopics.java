package br.com.microservices.orchestrated.orchestratorservice.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ETopics {

    START_SAGA("start-saga"),
    FINISH_SUCCESS("finish-success"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),
    PRODUCT_VALIDATION_SUCCESS("product-validation-success"),
    PAYMENT_FAIL("payment-fail"),
    PAYMENT_SUCCESS("payment-success"),
    INVENTORY_FAIL("inventory-fail"),
    INVENTORY_SUCCESS("inventory-success"),
    NOTIFY_ENDING("notify-ending"),
    BASE_ORCHESTRATOR("orchestrator");

    private final String topic;

}
