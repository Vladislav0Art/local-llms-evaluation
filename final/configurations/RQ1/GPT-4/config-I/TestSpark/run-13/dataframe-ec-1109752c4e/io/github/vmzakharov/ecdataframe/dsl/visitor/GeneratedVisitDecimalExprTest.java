package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr decimalExpr = new DecimalExpr(new ExprContext(), Value.newValue(5), Value.newValue(2));
        assertEquals("[5, 2]", PrettyPrintVisitor.exprToString(decimalExpr));
    }

}