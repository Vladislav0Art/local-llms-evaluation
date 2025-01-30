package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseOperatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void parseOperatorTest() throws Exception {
        ExpressionConfiguration configuration = ExpressionConfiguration.builder().build();
        Tokenizer tokenizer = new Tokenizer("1+2", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals("+", tokens.get(1).getValue());
        assertEquals(Token.TokenType.INFIX_OPERATOR, tokens.get(1).getType());
    }

}