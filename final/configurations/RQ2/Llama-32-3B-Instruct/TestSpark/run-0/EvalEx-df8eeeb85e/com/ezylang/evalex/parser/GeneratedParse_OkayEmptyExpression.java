package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

public class GeneratedParse_OkayEmptyExpression {

    @Test
    public void parse_OkayEmptyExpression() {
        String expressionString = "";
        List<Token> tokens = new ArrayList<>();

        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> expectedTokens = new ArrayList<>();
        for (TokenType type : TokenType.values()) {
            if (type != TokenType.EMPTY) {
                Token token = new Token(type, 0);
                expectedTokens.add(token);
            }
        }

        tokenizer.parse().forEach(token -> assertEquals(expectedTokens.remove(0), token));
    }

}