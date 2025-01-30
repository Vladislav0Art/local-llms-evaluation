package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseStringLiteralTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        String exp = "\"hello world\"";
        Tokenizer tokenizer = new Tokenizer(exp, configuration);
        List<Token> result = tokenizer.parse();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(Token.TokenType.STRING_LITERAL, result.get(0).getType());
    }

}