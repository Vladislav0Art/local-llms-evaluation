package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedParseExpressionWithHexStringLiteralTest {

    @Test
    public void parseExpressionWithHexStringLiteralTest() {
        Tokenizer tokenizer = new Tokenizer("0xA5", new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(1, tokens.size());
        Assert.assertEquals("0xA5", tokens.get(0).getText());
        Assert.assertEquals(TokenType.NUMBER_LITERAL, tokens.get(0).getType());
    }

}