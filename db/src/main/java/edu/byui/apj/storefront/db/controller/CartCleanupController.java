package edu.byui.apj.storefront.db.controller;

import edu.byui.apj.storefront.db.controller.dto.CartCleanupResponse;
import edu.byui.apj.storefront.db.service.CartCleanupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/internal/cart-cleanup")
public class CartCleanupController {

    private final CartCleanupService cleanupService;

    public CartCleanupController(CartCleanupService cleanupService){
        this.cleanupService = cleanupService;
    }

    @PostMapping
    public ResponseEntity<CartCleanupResponse> cleanup(
            @RequestParam(name = "maxAgeMinutes", defaultValue = "30") int maxAgeMinutes){
        if (maxAgeMinutes <= 0){
            return ResponseEntity.badRequest().build();
        }
        CartCleanupResponse response = cleanupService.cleanupExpiredCarts(maxAgeMinutes);
        return ResponseEntity.ok(response);
    }
}
