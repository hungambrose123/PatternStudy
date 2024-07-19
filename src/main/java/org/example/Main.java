package org.example;

import org.example.builderPattern.fastfoodOrderBuilder.FastfoodOrderBuilder;
import org.example.builderPattern.orderBuilder.OrderBuilder;
import org.example.builderPattern.product.ingredients.Bread;
import org.example.builderPattern.product.ingredients.Sauce;
import org.example.builderPattern.product.ingredients.Vegetable;
import org.example.builderPattern.product.order.Order;
import org.example.builderPattern.product.order.OrderType;
import org.example.factoryPattern.Bank;
import org.example.factoryPattern.BankFactory;
import org.example.factoryPattern.BankType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TECHCOMBANK);
        System.out.println(bank.getBankName());

        Order order = new FastfoodOrderBuilder()
                .orderType(OrderType.ON_SITE)
                        .orderSauce(Sauce.FISH_SAUCE)
                                .orderBread(Bread.PORK)
                                        .orderVegetable(Vegetable.TOMATO)
                                                .build();
        System.out.println("Order detail: ");
        System.out.println("Customer want to eat: "+ order.getOrderType());
        System.out.println("Bread: "+ order.getBread());
        System.out.println("Sauce: "+ order.getSauce());
        System.out.println("Vegetable: "+ order.getVegetable());
    }
}