package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        IndexExpr expr = new IndexExpr(new VarExpr("x"), new ValueExpr("0"));
        assertEquals("x[0]", PrettyPrintVisitor.exprToString(expr));
    }

}