package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;

import java.util.List;

public class GeneratedParseValidIdentifierTest {

    @Test
    public void parseValidIdentifierTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("myIdentifier123", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(
                new Token(0, "myIdentifier123", Token.TokenType.VARIABLE_OR_CONSTANT),
                tokens.get(0));
    }

}