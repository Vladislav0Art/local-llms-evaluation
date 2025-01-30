package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseStringLiteralTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void parseStringLiteralTest() throws Exception {
        ExpressionConfiguration configuration = ExpressionConfiguration.builder().build();
        Tokenizer tokenizer = new Tokenizer("\"abc\"", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals("abc", tokens.get(0).getValue());
        assertEquals(Token.TokenType.STRING_LITERAL, tokens.get(0).getType());
    }

}