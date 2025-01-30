package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseExpressionMissingClosingBraceTest {

    @Test
    public void parseExpressionMissingClosingBraceTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        String invalidExpression = "3*(2+2";
        new Tokenizer(invalidExpression, config).parse();
    }

}