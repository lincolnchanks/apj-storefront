package edu.byui.apj.storefront.db.controller.dto;

public record CreateOrderRequest(
        Long cartId,
        String customerName,
        String customerEmail,
        String shippingAddressLine1,
        String shippingAddressLine2,
        String shippingCity,
        String shippingState,
        String shippingPostalCode,
        String shippingCountry
) {
    public static CreateOrderRequest withDefaults(Long cartId){
        return new CreateOrderRequest(cartId, null, null,
                null, null, null,
                null, null, null);
    }
}
