package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseValidExpressionMultipleTokensTest {

    @Test
    public void parseValidExpressionMultipleTokensTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("5+2", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(Token.TokenType.TOKEN_TYPE_LITERAL, tokens.get(0).getType());
        assertEquals(Token.TokenType.TOKEN_TYPE_OPERATOR, tokens.get(1).getType());
        assertEquals(Token.TokenType.TOKEN_TYPE_LITERAL, tokens.get(2).getType());
    }

}