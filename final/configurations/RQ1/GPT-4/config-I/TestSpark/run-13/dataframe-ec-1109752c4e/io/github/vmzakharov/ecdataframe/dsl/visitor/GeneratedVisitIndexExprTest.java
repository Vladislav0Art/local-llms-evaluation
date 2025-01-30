package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        IndexExpr indexExpr = new IndexExpr(new ExprContext(), new VarExpr("var"), new DecimalExpr(new ExprContext(), Value.newValue(5), Value.newValue(2)));
        assertEquals("var[5, 2]", PrettyPrintVisitor.exprToString(indexExpr));
    }

}