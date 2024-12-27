package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedTokenizeMethodReturnsList {

    @Test
    public void tokenizeMethodReturnsList() {
        Tokenizer tokenizer = new Tokenizer("expression");
        List<Token> result = tokenizer.tokenize();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

}