package edu.byui.apj.storefront.web.model;

import java.time.Instant;
import java.util.List;

public record CartDTO(
        Long id,
        Instant createdAt,
        List<CartItemDTO> items
) {
}
