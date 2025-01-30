package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFunctionTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void parseFunctionTest() throws Exception {
        ExpressionConfiguration configuration = ExpressionConfiguration.builder().build();
        Tokenizer tokenizer = new Tokenizer("sin(60)", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals("sin", tokens.get(0).getValue());
        assertEquals(Token.TokenType.FUNCTION, tokens.get(0).getType());
    }

}