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

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        String stringWithStringLiteral = "\"test\"";
        Tokenizer tokenizer = new Tokenizer(stringWithStringLiteral, config);
        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertEquals(1, tokens.size());
        assertEquals(STRING_LITERAL, tokens.get(0).getType());
    }

}