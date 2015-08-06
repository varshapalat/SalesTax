package com.baseline.tax;

public class Item {
    String itemName;
    String state;
    double price;
    public Item(String item, String state, double price) {
        this.itemName = item;
        this.state = state;
        this.price = price;
    }

    public double computeBasicSalesTax() {
        if(itemName.equalsIgnoreCase("Book") || itemName.equalsIgnoreCase("Food") || itemName.equalsIgnoreCase("Medicines"))
            return 0;
        else
            return price * 0.10;
    }

    public double computeImportDuty() {
        if(state.equalsIgnoreCase("Imported"))
            return price * 0.05;
        else
            return 0;
    }
}
