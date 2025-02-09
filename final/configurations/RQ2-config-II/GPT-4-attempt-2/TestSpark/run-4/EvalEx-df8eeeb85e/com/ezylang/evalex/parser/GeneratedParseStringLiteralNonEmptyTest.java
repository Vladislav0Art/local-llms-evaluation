package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedParseStringLiteralNonEmptyTest {

    @Test
    public void parseStringLiteralNonEmptyTest() throws ParseException {
        String expressionString = "\"hello\"";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        Token actual = tokenizer.parseStringLiteral();

        Token expected = new Token(STRINGPARAM, "hello");

        Assert.assertEquals(expected, actual);
    }

}