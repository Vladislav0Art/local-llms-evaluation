package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExpr_AssignExpression_PrintsCorrectly {

    @Test
    public void visitAssignExpr_AssignExpression_PrintsCorrectly() {
        AssingExpr expr = new AssingExpr(new VarExpr("x"), new ConstExpr(10));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertEquals("x <- 10", result);
    }

}