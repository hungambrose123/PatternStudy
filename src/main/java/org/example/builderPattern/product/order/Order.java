package org.example.builderPattern.product.order;

import org.example.builderPattern.product.ingredients.Bread;
import org.example.builderPattern.product.ingredients.Sauce;
import org.example.builderPattern.product.ingredients.Vegetable;

public class Order {
    private final OrderType orderType;
    private final Bread bread;
    private final Sauce sauce;
    private final Vegetable vegetable;

    public Order(OrderType orderType,Bread bread, Sauce sauce, Vegetable vegetable) {
        this.bread = bread;
        this.orderType = orderType;
        this.sauce = sauce;
        this.vegetable = vegetable;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public Bread getBread() {
        return bread;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Vegetable getVegetable() {
        return vegetable;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderType=" + orderType +
                ", bread=" + bread +
                ", sauce=" + sauce +
                ", vegetable=" + vegetable +
                '}';
    }
}
