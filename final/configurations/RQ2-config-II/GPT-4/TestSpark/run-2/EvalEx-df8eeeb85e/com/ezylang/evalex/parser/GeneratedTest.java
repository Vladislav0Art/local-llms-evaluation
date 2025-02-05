package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseExpressionWithValidCharsTest() throws ParseException {
        String expressionString = "123+abc";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> tokenList = tokenizer.parse();

        assertEquals(3, tokenList.size());
    }

    @Test
    public void parseExpressionWithInvalidCharsTest() throws ParseException {
        String expressionString = "&*^%$@";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralWithValidCharsTest() throws ParseException {
        String expressionString = "'Hello World'";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        Token token = tokenizer.parseStringLiteral();

        assertNotNull(token);
    }

    @Test
    public void parseStringLiteralWithInvalidCharsTest() throws ParseException {
        String expressionString = "!#%^&*";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        tokenizer.parseStringLiteral();
    }

    @Test
    public void TokenizerConstructorTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("2+2", configuration);

        assertNotNull(tokenizer);
    }

    @Test
    public void TokenizerConstructorWithNullExpressionTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(null, configuration);
    }

    @Test
    public void TokenizerConstructorWithNullConfigTest() {
        Tokenizer tokenizer = new Tokenizer("2+2", null);
    }

}