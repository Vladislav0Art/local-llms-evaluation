package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitIfElseExpr_IfExpression {

    @Test
    public void testVisitIfElseExpr_IfExpression() {
        IfElseExpr expr = new IfElseExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitIfElseExpr(expr);
    }

}