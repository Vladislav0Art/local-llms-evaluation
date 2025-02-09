package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = Mockito.mock(Expression.class);
        assertEquals("", PrettyPrintVisitor.exprToString(expression));
    }

}