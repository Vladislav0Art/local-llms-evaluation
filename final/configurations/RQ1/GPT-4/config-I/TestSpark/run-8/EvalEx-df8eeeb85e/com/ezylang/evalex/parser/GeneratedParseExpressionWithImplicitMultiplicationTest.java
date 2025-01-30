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

public class GeneratedParseExpressionWithImplicitMultiplicationTest {

    @Test
    public void parseExpressionWithImplicitMultiplicationTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        Mockito.when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        Mockito.when(config.getOperatorDictionary()).thenReturn(operatorDictionary);
        Mockito.when(operatorDictionary.getInfixOperator("*")).thenReturn(Mockito.mock(OperatorIfc.class));

        Tokenizer tokenizer = new Tokenizer("5(2 + 3)", config);
        List<Token> tokens = tokenizer.parse();

        Assert.assertEquals(5, tokens.size());
        Assert.assertEquals("5", tokens.get(0).getText());
        Assert.assertEquals(NUMBER_LITERAL, tokens.get(0).getType());

        Assert.assertEquals("*", tokens.get(1).getText());
        Assert.assertEquals(INFIX_OPERATOR, tokens.get(1).getType());

        Assert.assertEquals("(", tokens.get(2).getText());
        Assert.assertEquals(BRACE_OPEN, tokens.get(2).getType());

        Assert.assertEquals("2 + 3", tokens.get(3).getText());
        Assert.assertEquals(VARIABLE_OR_CONSTANT, tokens.get(3).getType());

        Assert.assertEquals(")", tokens.get(4).getText());
        Assert.assertEquals(BRACE_CLOSE, tokens.get(4).getType());
    }

}