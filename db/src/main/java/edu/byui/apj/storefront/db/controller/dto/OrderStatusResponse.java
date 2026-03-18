package edu.byui.apj.storefront.db.controller.dto;

import edu.byui.apj.storefront.db.model.OrderStatus;

public record OrderStatusResponse (Long orderId, OrderStatus orderStatus) {
}
