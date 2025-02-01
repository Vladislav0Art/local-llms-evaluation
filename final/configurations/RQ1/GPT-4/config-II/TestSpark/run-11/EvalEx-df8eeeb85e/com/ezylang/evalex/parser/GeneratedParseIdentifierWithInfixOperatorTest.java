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

public class GeneratedParseIdentifierWithInfixOperatorTest {

    @Test
    public void parseIdentifierWithInfixOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorIfc operatorMock = mock(OperatorIfc.class);
        configuration.addInfixOperator("test", 1, true, operatorMock);
        Tokenizer tokenizer = new Tokenizer("1 test 2", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
        Assert.assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
        Assert.assertEquals(operatorMock, tokens.get(1).getOperator());
    }

}