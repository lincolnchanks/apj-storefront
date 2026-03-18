package edu.byui.apj.storefront.web.model;

public record CartItemDTO (
        Long id,
        String productId,
        String productName,
        int quantity,
        double price
){

}
