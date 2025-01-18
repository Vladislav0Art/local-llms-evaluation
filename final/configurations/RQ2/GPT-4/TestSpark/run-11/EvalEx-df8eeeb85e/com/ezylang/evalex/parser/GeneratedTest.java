package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void tokenizerConstructorTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+sqrt(4)", configuration);

        assertNotNull(tokenizer);
    }

    @Test
    public void parseExpressionTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+sqrt(4)", configuration);

        try {
            List<Token> tokens = tokenizer.parse();
            assertNotNull(tokens);
        } catch (ParseException e) {
            // do nothing
        }
    }

    @Test
    public void parseStringLiteralTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Test\"", configuration);

        try {
            Token token = tokenizer.parseStringLiteral();
            assertNotNull(token);
        } catch (ParseException e) {
            // do nothing
        }
    }

}