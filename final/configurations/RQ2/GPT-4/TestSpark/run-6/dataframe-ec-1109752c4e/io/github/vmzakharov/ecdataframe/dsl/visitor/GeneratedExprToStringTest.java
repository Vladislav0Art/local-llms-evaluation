package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expr1 = Mockito.mock(Expression.class);
        Expression expr2 = Mockito.mock(Expression.class);
        BinaryExpr expr = new BinaryExpr(expr1, "+", expr2);
        assertEquals("expression + expression", PrettyPrintVisitor.exprToString(expr));
    }

}