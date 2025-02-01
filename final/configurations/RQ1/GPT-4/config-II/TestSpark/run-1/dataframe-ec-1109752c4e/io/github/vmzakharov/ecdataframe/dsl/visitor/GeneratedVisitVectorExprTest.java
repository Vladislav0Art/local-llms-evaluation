package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        VectorExpr expr = new VectorExpr(new VarExpr("x"), new VarExpr("y"));
        assertEquals("(x, y)", PrettyPrintVisitor.exprToString(expr));
    }

}