package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExpr_AssignExpressionPrintedCorrectly {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void visitAssignExpr_AssignExpressionPrintedCorrectly() {
        AssingExpr expr = new AssingExpr(new VarExpr("x"), new BinaryExpr(new VarExpr("y"), "+", 2));
        visitor.visit(expr);
    }

}