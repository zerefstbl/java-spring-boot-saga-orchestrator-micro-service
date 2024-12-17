package br.com.microservices.orchestrated.orchestratorservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ETopics {

    START_SAGA("start-saga"),
    FINISH_SUCCESS("finish-success"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),
    PRODUCT_VALIDATION_SUCCESS("product-validation-success"),
    PAYMENT_VALIDATION_FAIL("payment-validation-fail"),
    PAYMENT_VALIDATION_SUCCESS("payment-validation-success"),
    INVENTORY_VALIDATION_FAIL("inventory-validation-fail"),
    INVENTORY_VALIDATION_SUCCESS("inventory-validation-success"),
    NOTIFY_ENDING("notify-ending"),
    BASE_ORCHESTRATOR("orchestrator");

    private String topic;

}
