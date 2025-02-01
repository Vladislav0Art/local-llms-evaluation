package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionary;
import com.ezylang.evalex.config.OperatorDictionary;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseTestEmptyStringShouldReturnEmptyList() throws ParseException {
        OperatorDictionary operatorDictionary = new OperatorDictionary();
        FunctionDictionary functionDictionary = new FunctionDictionary();
        ExpressionConfiguration configuration = new ExpressionConfiguration(operatorDictionary, functionDictionary);
        Tokenizer tokenizer = new Tokenizer("", configuration);

        List<Token> tokens = tokenizer.parse();

        Assert.assertTrue(tokens.isEmpty());
    }

    @Test
    public void parseTestUnclosedQuoteShouldThrowParseException() throws ParseException {
        OperatorDictionary operatorDictionary = new OperatorDictionary();
        FunctionDictionary functionDictionary = new FunctionDictionary();
        ExpressionConfiguration configuration = new ExpressionConfiguration(operatorDictionary, functionDictionary);
        Tokenizer tokenizer = new Tokenizer("\"Hello", configuration);

        tokenizer.parse();
    }

    @Test
    public void parseTestHelloWorldStringShouldReturnCorrectToken() throws ParseException {
        OperatorDictionary operatorDictionary = new OperatorDictionary();
        FunctionDictionary functionDictionary = new FunctionDictionary();
        ExpressionConfiguration configuration = new ExpressionConfiguration(operatorDictionary, functionDictionary);
        Tokenizer tokenizer = new Tokenizer("\"Hello, World!\"", configuration);

        List<Token> tokens = tokenizer.parse();

        Assert.assertEquals(1, tokens.size());
        Assert.assertEquals(Token.TokenType.STRING_LITERAL, tokens.get(0).getType());
        Assert.assertEquals("Hello, World!", tokens.get(0).getValue());
    }

    @Test
    public void parseTestUnclosedParenthesesShouldThrowParseException() throws ParseException {
        OperatorDictionary operatorDictionary = new OperatorDictionary();
        FunctionDictionary functionDictionary = new FunctionDictionary();
        ExpressionConfiguration configuration = new ExpressionConfiguration(operatorDictionary, functionDictionary);
        Tokenizer tokenizer = new Tokenizer("(1*(2+3", configuration);

        tokenizer.parse();
    }

    @Test
    public void parseTestSimpleExpressionShouldReturnCorrectTokenSequence() throws ParseException {
        OperatorDictionary operatorDictionary = new OperatorDictionary();
        FunctionDictionary functionDictionary = new FunctionDictionary();
        ExpressionConfiguration configuration = new ExpressionConfiguration(operatorDictionary, functionDictionary);
        Tokenizer tokenizer = new Tokenizer("1+2-3", configuration);

        List<Token> tokens = tokenizer.parse();

        Assert.assertEquals(5, tokens.size());
        Assert.assertEquals(Token.TokenType.NUMBER_LITERAL, tokens.get(0).getType());
        Assert.assertEquals("1", tokens.get(0).getValue());
        Assert.assertEquals(Token.TokenType.INFIX_OPERATOR, tokens.get(1).getType());
        Assert.assertEquals("+", tokens.get(1).getValue());
        Assert.assertEquals(Token.TokenType.NUMBER_LITERAL, tokens.get(2).getType());
        Assert.assertEquals("2", tokens.get(2).getValue());
        Assert.assertEquals(Token.TokenType.INFIX_OPERATOR, tokens.get(3).getType());
        Assert.assertEquals("-", tokens.get(3).getValue());
        Assert.assertEquals(Token.TokenType.NUMBER_LITERAL, tokens.get(4).getType());
        Assert.assertEquals("3", tokens.get(4).getValue());
    }

}