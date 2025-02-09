package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedExprToStringValidTest {

    @Test
    public void exprToStringValidTest() {
        BinaryExpr expr = Mockito.mock(BinaryExpr.class);
        var expected = "2 + 3";
        Mockito.when(expr.toString()).thenReturn(expected);

        var actual = PrettyPrintVisitor.exprToString(expr);
        Assert.assertEquals(expected, actual);
    }

}