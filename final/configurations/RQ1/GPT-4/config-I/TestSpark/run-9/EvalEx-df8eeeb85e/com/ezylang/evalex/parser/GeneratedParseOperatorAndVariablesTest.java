package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseOperatorAndVariablesTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void parseOperatorAndVariablesTest() throws Exception {
        ExpressionConfiguration configuration = ExpressionConfiguration.builder().build();
        Tokenizer tokenizer = new Tokenizer("a+b", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals("a", tokens.get(0).getValue());
        assertEquals(Token.TokenType.VARIABLE_OR_CONSTANT, tokens.get(0).getType());
        assertEquals("+", tokens.get(1).getValue());
        assertEquals(Token.TokenType.INFIX_OPERATOR, tokens.get(1).getType());
        assertEquals("b", tokens.get(2).getValue());
        assertEquals(Token.TokenType.VARIABLE_OR_CONSTANT, tokens.get(2).getType());
    }

}