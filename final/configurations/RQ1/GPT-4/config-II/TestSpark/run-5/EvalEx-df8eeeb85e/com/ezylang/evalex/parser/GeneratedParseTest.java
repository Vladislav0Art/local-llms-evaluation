package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        OperatorIfc mockOperator = Mockito.mock(OperatorIfc.class);
        when(operatorDictionary.hasInfixOperator("*")).thenReturn(true);
        when(operatorDictionary.getInfixOperator("*")).thenReturn(mockOperator);

        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(config.getOperatorDictionary()).thenReturn(operatorDictionary);

        Tokenizer tokenizer = new Tokenizer("5(5)", config);
        List<Token> result = tokenizer.parse();

        assertEquals(4, result.size());
        assertEquals(TokenType.NUMBER_LITERAL, result.get(0).getType());
        assertEquals(TokenType.INFIX_OPERATOR, result.get(1).getType());
        assertEquals(TokenType.BRACE_OPEN, result.get(2).getType());
        assertEquals(TokenType.NUMBER_LITERAL, result.get(3).getType());
    }

}