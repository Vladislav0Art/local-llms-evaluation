package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Token.TokenType;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseStringLiteralToValidStringTest {

    @Test
    public void parseStringLiteralToValidStringTest() throws ParseException {
        String expressionString = "'Hello, World!'";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        Token result = tokenizer.parseStringLiteral();

        Assert.assertNotNull(result);
        Assert.assertEquals(result.getValue(), "'Hello, World!'");
    }

}