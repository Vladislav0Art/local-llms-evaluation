package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseParenthesisExpressionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseParenthesisExpressionTest() throws ParseException {
        final Tokenizer tokenizer = new Tokenizer("(1+1)*2", createMockExpressionConfiguration());
        final List<Token> tokenList = tokenizer.parse();
        Assert.assertEquals(7, tokenList.size());
    }

}