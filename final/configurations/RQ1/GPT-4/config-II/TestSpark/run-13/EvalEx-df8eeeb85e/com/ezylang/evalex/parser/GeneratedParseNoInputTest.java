package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseNoInputTest {

    @Test
    public void parseNoInputTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("", config);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

}