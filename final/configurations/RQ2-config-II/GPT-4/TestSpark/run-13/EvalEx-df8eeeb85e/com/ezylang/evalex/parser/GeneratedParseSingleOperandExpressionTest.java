package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseSingleOperandExpressionTest {

    @Test
    public void parseSingleOperandExpressionTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer token = new Tokenizer("10", configuration);
        List<Token> tokens = token.parse();
        Assert.assertEquals(1, tokens.size());
        Assert.assertEquals(Token.TokenType.LITERAL_NUM, tokens.get(0).getType());
    }

}