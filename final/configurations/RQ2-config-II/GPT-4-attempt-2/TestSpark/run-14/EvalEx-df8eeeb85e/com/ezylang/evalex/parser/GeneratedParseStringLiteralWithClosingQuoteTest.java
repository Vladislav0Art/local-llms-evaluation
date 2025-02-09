package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseStringLiteralWithClosingQuoteTest {

    @Test
    public void parseStringLiteralWithClosingQuoteTest() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("'stringLiteral'", expressionConfiguration);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals(TokenType.STRINGPARAM, token.type);
        Assert.assertEquals("stringLiteral", token.surface);
    }

}