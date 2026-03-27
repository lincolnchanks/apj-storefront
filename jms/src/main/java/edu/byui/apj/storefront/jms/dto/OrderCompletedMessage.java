package edu.byui.apj.storefront.jms.dto;

import java.time.Instant;

public record OrderCompletedMessage(
        String eventType,
        Long orderId,
        Instant completedAt
) {
}
