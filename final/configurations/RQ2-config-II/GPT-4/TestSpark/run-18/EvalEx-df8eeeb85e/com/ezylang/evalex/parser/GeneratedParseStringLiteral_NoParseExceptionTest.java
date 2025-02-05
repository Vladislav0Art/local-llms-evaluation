package com.ezylang.evalex.parser;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseStringLiteral_NoParseExceptionTest {

    @Test
    public void parseStringLiteral_NoParseExceptionTest() {
        String expressionString = "\"string\"";
        ExpressionConfiguration configuration = new ExpressionConfiguration(new OperatorDictionaryIfc() {
        },
                new FunctionDictionaryIfc() {
                }, 1, true);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        try {
            Token token = tokenizer.parseStringLiteral();
            assertNotNull(token);
            assertEquals(token.getType(), Token.TokenType.STRING_LITERAL);
        } catch (ParseException e) {
            fail("ParseException should not have been thrown");
        }
    }

}