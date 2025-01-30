package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueExpr;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        ValueExpr valueExprMock = mock(ValueExpr.class);
        when(valueExprMock.asString()).thenReturn("mockExpression");

        String result = PrettyPrintVisitor.exprToString(valueExprMock);

        Assert.assertEquals("mockExpression", result);
    }

}