package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr expr = new VarExpr("x");
        assertEquals("x", PrettyPrintVisitor.exprToString(expr));
    }

}