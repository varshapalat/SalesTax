package com.baseline.tax;

public class Item {
    private String itemName;
    private String state;
    private double price;
    private double totalPrice;
    public Item(String item, String state, double price) {
        this.itemName = item;
        this.state = state;
        this.price = price;
    }

    private double computeBasicSalesTax() {
        if(itemName.equalsIgnoreCase("Book") || itemName.equalsIgnoreCase("Food") || itemName.equalsIgnoreCase("Medicines"))
            return 0;
        else
            return price * 0.10;
    }

    private double computeImportDuty() {
        if(state.equalsIgnoreCase("Imported"))
            return price * 0.05;
        else
            return 0;
    }

    public double computeTotalPrice() {
        totalPrice = this.price + this.computeBasicSalesTax() + this.computeImportDuty();
        return totalPrice;
    }

    public String getItemName() {
        return itemName;
    }
}
