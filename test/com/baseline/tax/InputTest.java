package com.baseline.tax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;


public class InputTest {
    InputStream originalIn;


    @Before
    public void setUpStreams() {
        originalIn = System.in;
    }

    @After
    public void cleanUpStreams() {
        System.setIn(originalIn);
    }


    @Test
    public void viewShouldTakeUserInput() {
        Input input = new Input();

        System.setIn(new ByteArrayInputStream("1 book at 12.49".getBytes()));

        assertEquals("1 book at 12.49", input.acceptInput());
    }
}
