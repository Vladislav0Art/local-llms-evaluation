package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = new Expression();
        String result = PrettyPrintVisitor.exprToString(e);
        assertEquals("", result);
    }

}