package com.baseline.tax;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        Item itemOne = new Item("Book", "Unimported", 12.49);
        Item itemTwo = new Item("Music", "Unimported", 14.99);
        Item itemThree = new Item("Food", "Unimported", 0.85);
        ArrayList<String> lexedInput = new ArrayList<String>();

        Input input = new Input();

        Lexer lexer = new Lexer(lexedInput);
        lexer.lex(input.acceptInput());

        System.out.print(itemOne.getItemName() + "\t" + itemOne.computeTotalPrice() + "\n");
        System.out.print(itemTwo.getItemName() + "\t" + itemTwo.computeTotalPrice() + "\n");
        System.out.print(itemThree.getItemName() + "\t" + itemThree.computeTotalPrice()+ "\n");
        double totalSalesTax = itemOne.computeTax() + itemOne.computeTax() + itemThree.computeTax();
        System.out.print("Sales Taxes: " + totalSalesTax + "\n");
        double totalAmount = itemOne.computeTotalPrice() + itemTwo.computeTotalPrice() + itemThree.computeTotalPrice();
        System.out.print("Total: " + totalAmount + "\n");
    }
}
