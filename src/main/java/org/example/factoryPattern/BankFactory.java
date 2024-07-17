package org.example.factoryPattern;

public class BankFactory {
    private BankFactory(){}

    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case VIETCOMBANK:
                return new Vietcombank();
            case TBBANK:
                return new TPBank();
            default:
                throw new IllegalArgumentException("Not supported bank type!");
        }
    }
}
