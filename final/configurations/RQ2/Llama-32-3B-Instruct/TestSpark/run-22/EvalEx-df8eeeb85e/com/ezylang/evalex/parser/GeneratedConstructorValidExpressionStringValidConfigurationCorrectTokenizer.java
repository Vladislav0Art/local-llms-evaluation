package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedConstructorValidExpressionStringValidConfigurationCorrectTokenizer {

    @Test
    public void constructorValidExpressionStringValidConfigurationCorrectTokenizer() {
        Tokenizer tokenizer = new Tokenizer("expression", ExpressionConfiguration.create());
        assertNotNull(tokenizer);
    }

}