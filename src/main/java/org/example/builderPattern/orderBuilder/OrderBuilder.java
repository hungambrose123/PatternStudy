package org.example.builderPattern.orderBuilder;

import org.example.builderPattern.product.ingredients.Bread;
import org.example.builderPattern.product.ingredients.Sauce;
import org.example.builderPattern.product.ingredients.Vegetable;
import org.example.builderPattern.product.order.Order;
import org.example.builderPattern.product.order.OrderType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);
    OrderBuilder orderBread(Bread bread);
    OrderBuilder orderSauce(Sauce sauce);
    OrderBuilder orderVegetable(Vegetable vegetable);

    Order build();
}
