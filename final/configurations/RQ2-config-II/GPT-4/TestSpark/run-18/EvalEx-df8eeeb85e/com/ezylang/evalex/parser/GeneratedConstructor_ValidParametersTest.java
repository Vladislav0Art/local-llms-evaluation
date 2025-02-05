package com.ezylang.evalex.parser;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_ValidParametersTest {

    @Test
    public void constructor_ValidParametersTest() {
        String expressionString = "2+2";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
            assertNotNull(tokenizer);
        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }

}