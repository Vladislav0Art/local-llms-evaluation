package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        DecimalExpr decimalExpr = new DecimalExpr(null, 10.0);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String output = PrettyPrintVisitor.exprToString(decimalExpr);
        assertEquals("10.0", output);
    }

}