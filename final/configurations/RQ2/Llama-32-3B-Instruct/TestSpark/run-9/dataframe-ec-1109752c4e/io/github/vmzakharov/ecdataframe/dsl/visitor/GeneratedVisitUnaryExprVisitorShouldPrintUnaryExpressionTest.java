package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.Expression;

public class GeneratedVisitUnaryExprVisitorShouldPrintUnaryExpressionTest {

    @Test
    public void visitUnaryExprVisitorShouldPrintUnaryExpressionTest() {
        UnaryExpr unaryExpr = new UnaryExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(unaryExpr);
        assertTrue(String.contains("-", visitor.getPrinter().toString()));
    }

}