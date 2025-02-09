package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseStringLiteralValidTest {

    @Test
    public void parseStringLiteralValidTest() throws ParseException {
        String testExpression = "\"hello\"";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        Token result = tokenizer.parseStringLiteral();
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.TokenType.STRINGPARAM, result.getType());
        Assert.assertEquals("hello", result.getSurface());
    }

}