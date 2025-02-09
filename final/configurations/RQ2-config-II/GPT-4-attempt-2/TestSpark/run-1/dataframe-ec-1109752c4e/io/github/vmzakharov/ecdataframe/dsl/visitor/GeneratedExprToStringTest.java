package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = Mockito.mock(Expression.class);
        String expected = "mocked expression";
        Mockito.when(e.toString()).thenReturn(expected);
        String actual = PrettyPrintVisitor.exprToString(e);
        Assert.assertEquals(expected, actual);
    }

}