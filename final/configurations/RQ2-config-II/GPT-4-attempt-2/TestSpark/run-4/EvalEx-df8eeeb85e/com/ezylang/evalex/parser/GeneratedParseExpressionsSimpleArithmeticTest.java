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

public class GeneratedParseExpressionsSimpleArithmeticTest {

    @Test
    public void parseExpressionsSimpleArithmeticTest() throws ParseException {
        String expressionString = "5+3";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> expected = new ArrayList<>();
        expected.add(new Token(NUMBER, "5"));
        expected.add(new Token(OPERATOR, "+"));
        expected.add(new Token(NUMBER, "3"));

        List<Token> actual = tokenizer.parse();

        Assert.assertEquals(expected, actual);
    }

}