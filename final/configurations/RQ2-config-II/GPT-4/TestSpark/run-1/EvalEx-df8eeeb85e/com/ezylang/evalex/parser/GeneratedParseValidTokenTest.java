package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.*;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedParseValidTokenTest {

    @Test
    public void parseValidTokenTest() {
        try {
            ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
            StringTokenizer tokenizer = new StringTokenizer("**2+2", mockConfig);
            List<Token> tokens = tokenizer.parse();
            assertEquals(tokens.size(), 3);
        } catch (Exception e) {
            fail("Parse failed with exception: " + e.getMessage());
        }
    }

}