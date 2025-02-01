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

public class GeneratedParseFunctionTest {

    @Test
    public void parseFunctionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDic = mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDic = mock(FunctionDictionaryIfc.class);
        OperatorIfc operator = mock(OperatorIfc.class);
        FunctionIfc function = mock(FunctionIfc.class);
        when(config.getOperatorDictionary()).thenReturn(operatorDic);
        when(config.getFunctionDictionary()).thenReturn(functionDic);
        when(operatorDic.hasInfixOperator(anyString())).thenReturn(true);
        when(operatorDic.getInfixOperator(anyString())).thenReturn(operator);
        when(functionDic.hasFunction(anyString())).thenReturn(true);
        when(functionDic.getFunction(anyString())).thenReturn(function);
        Tokenizer tokenizer = new Tokenizer("4+sum(1,2,3)", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(8, tokens.size());
        assertEquals(TokenType.FUNCTION, tokens.get(2).getType());
    }

}