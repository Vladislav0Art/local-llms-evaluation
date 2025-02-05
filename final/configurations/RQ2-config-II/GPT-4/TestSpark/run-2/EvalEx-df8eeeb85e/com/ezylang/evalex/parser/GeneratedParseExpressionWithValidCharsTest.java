package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseExpressionWithValidCharsTest {

    @Test
    public void parseExpressionWithValidCharsTest() throws ParseException {
        String expressionString = "123+abc";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> tokenList = tokenizer.parse();

        assertEquals(3, tokenList.size());
    }

}