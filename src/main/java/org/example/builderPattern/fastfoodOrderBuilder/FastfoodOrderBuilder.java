package org.example.builderPattern.fastfoodOrderBuilder;

import org.example.builderPattern.orderBuilder.OrderBuilder;
import org.example.builderPattern.product.ingredients.Bread;
import org.example.builderPattern.product.ingredients.Sauce;
import org.example.builderPattern.product.ingredients.Vegetable;
import org.example.builderPattern.product.order.Order;
import org.example.builderPattern.product.order.OrderType;

public class FastfoodOrderBuilder implements OrderBuilder {
    private OrderType orderType;
    private Bread bread;
    private Sauce sauce;
    private Vegetable vegetable;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(Bread bread) {
        this.bread = bread;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(Vegetable vegetable) {
        this.vegetable = vegetable;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, bread, sauce, vegetable);
    }
}
