package edu.byui.apj.storefront.db.controller.dto;

import java.time.Instant;

// Returns a summary of a Cart cleanup job
public record CartCleanupResponse(
        int removedCount,
        int maxAgeMinutes,
        Instant cutoffTime,
        Instant runAt
) {
}
