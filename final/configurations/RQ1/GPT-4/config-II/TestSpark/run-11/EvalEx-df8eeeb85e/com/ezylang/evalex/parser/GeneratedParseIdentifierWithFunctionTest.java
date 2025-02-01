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

public class GeneratedParseIdentifierWithFunctionTest {

    @Test
    public void parseIdentifierWithFunctionTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionIfc functionMock = mock(FunctionIfc.class);
        configuration.addFunction("test", functionMock);
        Tokenizer tokenizer = new Tokenizer("test(1)", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(4, tokens.size());
        Assert.assertEquals(FUNCTION, tokens.get(0).getType());
        Assert.assertEquals(functionMock, tokens.get(0).getFunction());
    }

}