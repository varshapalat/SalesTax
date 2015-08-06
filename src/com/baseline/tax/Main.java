package com.baseline.tax;

public class Main {
    public static void main(String [] args) {
        Item itemOne = new Item("Book", "Unimported", 12.49);
        Item itemTwo = new Item("Music", "Unimported", 14.99);
        Item itemThree = new Item("Food", "Unimported", 0.85);

        itemOne.computeBasicSalesTax();
        itemOne.computeImportDuty();
    }
}
