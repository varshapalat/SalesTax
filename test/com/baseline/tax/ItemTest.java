package com.baseline.tax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void computeSalesTaxWhenNonTaxableItem() {
        Item itemOne = new Item("Book", "Unimported", 12.49);

        assertEquals(0, itemOne.computeBasicSalesTax(), 0);
    }

    @Test
    public void computeSalesTaxWhenTaxableItem() {
        Item itemTwo = new Item("Music", "Unimported", 14.99);

        assertEquals(.15, itemTwo.computeBasicSalesTax(), 0.05);
    }
}
