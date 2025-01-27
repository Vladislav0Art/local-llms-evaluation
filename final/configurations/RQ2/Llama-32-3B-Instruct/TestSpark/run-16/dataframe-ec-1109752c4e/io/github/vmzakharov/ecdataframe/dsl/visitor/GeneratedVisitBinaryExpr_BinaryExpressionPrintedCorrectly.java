package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExpr_BinaryExpressionPrintedCorrectly {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void visitBinaryExpr_BinaryExpressionPrintedCorrectly() {
        BinaryExpr expr = new BinaryExpr(new VarExpr("x"), "+", new DecimalExpr(2));
        visitor.visit(expr);
    }

}