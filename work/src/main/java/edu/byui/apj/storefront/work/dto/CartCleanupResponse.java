package edu.byui.apj.storefront.work.dto;

import java.time.Instant;

// Same as the db module's CartCleanupResponse DTO
// WebClient deserializes the JSON response (probably the one from DB)
// into this record. The names and types must match the DB's JSON response.
public record CartCleanupResponse(
        int removedCount,
        int maxAgeMinutes,
        Instant cutoffTime,
        Instant runAt
) { }
