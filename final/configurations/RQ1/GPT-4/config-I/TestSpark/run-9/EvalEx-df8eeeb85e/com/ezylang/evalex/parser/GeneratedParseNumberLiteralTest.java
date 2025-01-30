package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseNumberLiteralTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void parseNumberLiteralTest() throws Exception {
        ExpressionConfiguration configuration = ExpressionConfiguration.builder().build();
        Tokenizer tokenizer = new Tokenizer("123", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals("123", tokens.get(0).getValue());
        assertEquals(Token.TokenType.NUMBER_LITERAL, tokens.get(0).getType());
    }

}