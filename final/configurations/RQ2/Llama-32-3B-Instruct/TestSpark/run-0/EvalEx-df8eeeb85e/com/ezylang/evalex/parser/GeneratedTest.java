package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructor_OkayExpression() {
        String expressionString = "1+2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void constructor_OkayEmptyExpression() {
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void constructor_OkayNotValidExpression() {
        String expressionString = "@#$";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        new Tokenizer(expressionString, configuration);
    }

    @Test
    public void parse_OkayExpression() {
        String expressionString = "1+2*3";
        List<Token> tokens = new ArrayList<>();
        // mock function and operator dictionaries
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TYPE_NUMBER, 1));
        expectedTokens.add(new Token(TYPE_PLUS, 0));
        expectedTokens.add(new Token(TYPE_NUMBER, 2));
        expectedTokens.add(new Token(TYPE_STAR, 0));
        expectedTokens.add(new Token(TYPE_NUMBER, 3));

        tokenizer.parse().forEach(token -> assertEquals(expectedTokens.remove(0), token));
    }

    @Test
    public void parse_OkayEmptyExpression() {
        String expressionString = "";
        List<Token> tokens = new ArrayList<>();

        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> expectedTokens = new ArrayList<>();
        for (TokenType type : TokenType.values()) {
            if (type != TokenType.EMPTY) {
                Token token = new Token(type, 0);
                expectedTokens.add(token);
            }
        }

        tokenizer.parse().forEach(token -> assertEquals(expectedTokens.remove(0), token));
    }

    @Test
    public void parse_OkayNotValidExpression() {
        String expressionString = "#$";
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
            tokenizer.parse();
            assertFalse(true); // this should not happen
        } catch (ParseException e) {
            assertTrue(true);
        }
    }

}