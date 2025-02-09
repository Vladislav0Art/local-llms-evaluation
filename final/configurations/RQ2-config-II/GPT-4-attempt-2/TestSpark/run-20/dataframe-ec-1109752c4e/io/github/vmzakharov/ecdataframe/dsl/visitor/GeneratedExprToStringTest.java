package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = Mockito.mock(Expression.class);
        String expected = "expected string";
        Mockito.when(expression.evalAsString()).thenReturn(expected);

        String result = PrettyPrintVisitor.exprToString(expression);

        assertEquals(expected, result);
    }

}