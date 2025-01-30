package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() {
        ExpressionConfiguration config = createMockConfig();
        Tokenizer tokenizer = new Tokenizer("1+2", config);
        try {
            List<Token> tokenList = tokenizer.parse();
            Assert.assertEquals(3, tokenList.size());
            Assert.assertEquals(Token.TokenType.NUMBER_LITERAL, tokenList.get(0).getType());
            Assert.assertEquals(Token.TokenType.INFIX_OPERATOR, tokenList.get(1).getType());
            Assert.assertEquals(Token.TokenType.NUMBER_LITERAL, tokenList.get(2).getType());
        } catch (ParseException e) {
            Assert.fail("ParseException was thrown");
        }
    }

}