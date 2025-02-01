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

public class GeneratedParseValidExpressionAfterInfixTokenTest {

    @Test
    public void parseValidExpressionAfterInfixTokenTest() throws ParseException {
        ExpressionConfiguration configurationMock = mock(ExpressionConfiguration.class);
        when(configurationMock.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("3*2", configurationMock);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
        Assert.assertEquals(NUMBER_LITERAL, tokens.get(0).getType());
        Assert.assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
        Assert.assertEquals(NUMBER_LITERAL, tokens.get(2).getType());
    }

}