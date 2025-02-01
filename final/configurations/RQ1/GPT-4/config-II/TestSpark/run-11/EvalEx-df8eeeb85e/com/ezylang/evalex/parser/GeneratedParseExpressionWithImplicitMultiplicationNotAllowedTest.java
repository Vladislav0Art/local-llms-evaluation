package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;
import static org.mockito.Mockito.*;

public class GeneratedParseExpressionWithImplicitMultiplicationNotAllowedTest {

    @Test
    public void parseExpressionWithImplicitMultiplicationNotAllowedTest() throws ParseException {
        ExpressionConfiguration configurationMock = mock(ExpressionConfiguration.class);
        when(configurationMock.isImplicitMultiplicationAllowed()).thenReturn(false);
        Tokenizer tokenizer = new Tokenizer("3(2+2)", configurationMock);
        try {
            tokenizer.parse();
            Assert.fail("Exception should have been thrown");
        } catch (ParseException ex) {
            Assert.assertEquals("Missing operator", ex.getMessage());
        }
    }

}