package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseMethodReturnsList {

    @Test
    public void parseMethodReturnsList() {
        Tokenizer tokenizer = new Tokenizer("expression");
        List<Token> result = tokenizer.parse();
        assertNotNull(result);
    }

}