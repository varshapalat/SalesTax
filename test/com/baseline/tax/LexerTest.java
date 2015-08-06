package com.baseline.tax;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LexerTest {

    @Test
    public void foo() {
        ArrayList<String> expectedLexedInput = new ArrayList<String>();
        ArrayList<String> actualexedInput = new ArrayList<String>();

        String input = "1 unimported book at 12.49";
        expectedLexedInput.add("1");
        expectedLexedInput.add("unimported");
        expectedLexedInput.add("book");
        expectedLexedInput.add("at");
        expectedLexedInput.add("12.49");
        Lexer lexer = new Lexer(actualexedInput);

        assertEquals(expectedLexedInput, lexer.lex(input));
    }
}
