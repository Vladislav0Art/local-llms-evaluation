package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = new Expression();
        String result = PrettyPrintVisitor.exprToString(e);

        assertEquals("", result);
    }

}