package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalExpressionTest {

    @Test
    public void decimalExpressionTest() {
        DecimalExpr expr = new DecimalExpr(123.45);
        String expectedOutput = "123.45";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}