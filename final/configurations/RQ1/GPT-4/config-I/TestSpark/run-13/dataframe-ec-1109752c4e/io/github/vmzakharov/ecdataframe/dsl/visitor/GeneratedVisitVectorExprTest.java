package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        VectorExpr vectorExpr = new VectorExpr(new ExprContext(), new DecimalExpr(new ExprContext(), Value.newValue(5), Value.newValue(2)));
        assertEquals("(5, 2)", PrettyPrintVisitor.exprToString(vectorExpr));
    }

}