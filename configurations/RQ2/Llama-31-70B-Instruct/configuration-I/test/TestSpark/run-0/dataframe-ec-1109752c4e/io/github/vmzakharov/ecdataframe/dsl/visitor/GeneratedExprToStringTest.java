package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = mock(Expression.class);
        String result = PrettyPrintVisitor.exprToString(expression);
        assertNotNull(result);
    }

}