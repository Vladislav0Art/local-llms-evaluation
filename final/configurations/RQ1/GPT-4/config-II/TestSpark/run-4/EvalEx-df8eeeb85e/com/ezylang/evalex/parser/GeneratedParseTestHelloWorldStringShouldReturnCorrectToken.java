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

public class GeneratedParseTestHelloWorldStringShouldReturnCorrectToken {

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

}