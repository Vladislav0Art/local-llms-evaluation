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

public class GeneratedParseIdentifierWithPrefixOperatorTest {

    @Test
    public void parseIdentifierWithPrefixOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorIfc operatorMock = mock(OperatorIfc.class);
        configuration.addPrefixOperator("test", 1, true, operatorMock);
        Tokenizer tokenizer = new Tokenizer("test(1)", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(4, tokens.size());
        Assert.assertEquals(PREFIX_OPERATOR, tokens.get(0).getType());
        Assert.assertEquals(operatorMock, tokens.get(0).getOperator());
    }

}