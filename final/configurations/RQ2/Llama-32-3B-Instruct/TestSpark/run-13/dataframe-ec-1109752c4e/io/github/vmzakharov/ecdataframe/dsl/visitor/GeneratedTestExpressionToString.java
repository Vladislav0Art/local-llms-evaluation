package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestExpressionToString {

    @Test
    public void testExpressionToString() {
        Expression e = Mockito.mock(Expression.class);
        String result = io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.exprToString(e);
        assertNotNull(result);
    }

}