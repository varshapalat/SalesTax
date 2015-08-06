package com.baseline.tax;

import java.util.ArrayList;

public class Lexer {
    ArrayList<String> lexedInput;
    public Lexer(ArrayList<String> lexedInput) {
        this.lexedInput = lexedInput;
    }
    public ArrayList<String> lex(String input) {
        String[] splited = input.split("\\s+");
        for (int i = 0; i < splited.length; i++) {
            lexedInput.add(splited[i]);
        }
        return lexedInput;
    }
}
