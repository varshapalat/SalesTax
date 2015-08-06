package com.baseline.tax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void computeTotalPriceAfterTax() {
        Item itemOne = new Item("Book", "Unimported", 12.49);

        assertEquals(12.49, itemOne.computeTotalPrice(), 0.05);
    }

    @Test
    public void getItemName() {
        Item itemOne = new Item("Book", "Unimported", 12.49);

        assertEquals("Book", itemOne.getItemName());
    }
}
