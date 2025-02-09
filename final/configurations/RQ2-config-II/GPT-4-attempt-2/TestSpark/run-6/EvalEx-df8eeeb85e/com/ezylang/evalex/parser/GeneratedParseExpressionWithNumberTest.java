package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseExpressionWithNumberTest {

    @Test
    public void parseExpressionWithNumberTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("50", config);
        List<Token> result = tokenizer.parse();
        assertEquals(1, result.size());
        assertEquals(new Token(Token.TokenType.NUMERIC, "50"), result.get(0));
    }

}