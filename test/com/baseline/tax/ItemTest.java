package com.baseline.tax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void foo() {
        Item itemOne = new Item("Book", "Unimported", 12.49);

        assertEquals(0, itemOne.computeBasicSalesTax(), 0);
    }
}
