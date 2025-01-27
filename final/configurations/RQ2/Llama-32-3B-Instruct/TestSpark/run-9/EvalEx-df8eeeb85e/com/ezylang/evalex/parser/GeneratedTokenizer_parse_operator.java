package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTokenizer_parse_operator {

    @Test
    public void tokenizer_parse_operator() {
        // Arrange
        String expressionString = "1 + 2 *";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        OperatorIfc operator = new OperatorIfc();

        // Act and Assert
        try {
            tokenizer.parse();
            assert false;
        } catch (ParseException e) {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(OperatorIfc.OPERATOR_NAME, ((Token) tokens.get(0)).getType());
        }
    }

}