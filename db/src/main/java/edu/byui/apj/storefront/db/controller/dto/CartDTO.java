package edu.byui.apj.storefront.db.controller.dto;

import java.time.Instant;
import java.util.List;

public record CartDTO(
        Long id,
        Instant createdAt,
        List<CartItemDTO> items
) {
}
