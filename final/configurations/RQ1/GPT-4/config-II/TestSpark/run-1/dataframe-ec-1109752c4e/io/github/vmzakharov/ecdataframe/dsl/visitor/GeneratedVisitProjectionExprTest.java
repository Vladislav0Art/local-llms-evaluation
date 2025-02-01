package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr expr = new ProjectionExpr(null);
        expr.addExpression(new AliasExpr("a", new VarExpr("x")));
        expr.addExpression(new AliasExpr("b", new VarExpr("y")));
        assertEquals("project {a : x, b : y}", PrettyPrintVisitor.exprToString(expr));
    }

}