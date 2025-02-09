package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.*;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+1", config);
        List<Token> result = tokenizer.parse();
        assert result != null;
    }

    @Test
    public void parseExceptionTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+*", config);
        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Hello, World!\"", config);
        Token result = tokenizer.parseStringLiteral();
        assert result != null;
    }

    @Test
    public void parseStringLiteralExceptionTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Hello, World!", config);
        tokenizer.parseStringLiteral();
    }

    @Test
    public void constructedWithValidArgumentsTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        try {
            Tokenizer tokenizer = new Tokenizer("1+1", config);
            assert tokenizer != null;
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void constructedWithNullArgumentsTest() {
        Tokenizer tokenizer = new Tokenizer(null, null);
    }

}