package edu.byui.apj.storefront.db.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    private String productId;
    private String productName;
    private double price;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
