package org.example;

import org.example.factoryPattern.Bank;
import org.example.factoryPattern.BankFactory;
import org.example.factoryPattern.BankType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName());
    }
}