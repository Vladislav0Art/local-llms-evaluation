package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;

import java.util.List;

public class GeneratedValidateTokenUnexpectedTokenAfterInfixOperatorTest {

    @Test
    public void validateTokenUnexpectedTokenAfterInfixOperatorTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("2+*", config);
        try {
            tokenizer.parse();
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Unexpected token after infix operator", e.getMessage());
        }
    }

}